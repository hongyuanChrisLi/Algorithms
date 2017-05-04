package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
/*
 * 

https://leetcode.com/problems/container-with-most-water/#/description

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

 * 
 * */
public class MaxArea extends Solution<int[], Integer> {

    @Override
    protected Integer runTest(int[] input) {
        return this.maxArea(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int maxArea(int[] height) {
        return 0;
    }

}
