package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import base.Solution;

/*
 * 
https://leetcode.com/problems/maximum-subarray/#/description

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

 * 
 * */


public class MaxSubSeqSumBtmUp extends Solution<int[], Integer> {

    @Override
    protected Integer runTest(int[] input) {
        return maxSubArray(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int maxSubArray(int[] nums) {
        
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        
        if (len < 1) return maxSum;
        
        int[][] refTab = new int[len + 1][len + 1];
        
        
        for ( int i = len; i > 0; i -- ) {
            for (int j = i; j <= len; j ++ ) {
                if (j == i) refTab[i][j] = nums[i-1];
                else {
                    refTab[i][j] = refTab[i][j-1] + refTab[i+1][j] - refTab[i+1][j-1];
                }
                
                if (refTab[i][j] > maxSum) maxSum = refTab[i][j];
            }
        }

        /*for (int i = 0; i <= len; i ++ )
            System.out.println(Arrays.toString(refTab[i]));*/
        
        return maxSum;
    }
}
