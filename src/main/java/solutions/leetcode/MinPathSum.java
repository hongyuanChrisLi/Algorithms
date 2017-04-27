package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import base.Solution;


/*
 * 
https://leetcode.com/problems/minimum-path-sum/#/description

Given a m x n grid filled with non-negative numbers, 
    find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.
 * 
 * */

public class MinPathSum extends Solution<int[][], Integer> {

    @Override
    protected Integer runTest(int[][] input) {
        return this.minPathSum(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int minPathSum(int[][] grid) {
        
        int m = grid.length, n;
        //System.out.println(m);
        if (m > 0) n = grid[0].length;
        else return 0;
        
        for (int i = 1; i < m; i++ )
            grid[i][0] += grid[i-1][0];
        
        for (int j = 1; j < n; j++)
            grid[0][j] += grid[0][j-1];
        
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++) 
                grid[i][j] = Math.min(grid[i][j-1], grid[i-1][j]) + grid[i][j];
        
        /*for (int i = 0; i < m; i++)
            System.out.println(Arrays.toString(grid[i]));*/
        
        return grid[m-1][n-1];
    }

}
