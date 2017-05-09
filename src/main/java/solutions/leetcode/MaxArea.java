package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.MaxAreaTestCases;
/*
 * 

https://leetcode.com/problems/container-with-most-water/#/description

Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.

https://leetcode.com/articles/container-most-water/
https://discuss.leetcode.com/topic/503/anyone-who-has-a-o-n-algorithm/3

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
        
        int arrayLen = height.length;
        int i = 0, j = arrayLen - 1;
        int maxArea = 0;
        
        while (i < j) {
            int minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, (j-i)*minHeight);
            if ( height[i] < height[j]) i += 1;
            else j -= 1;
        }
        
        return maxArea;
    }

    @Override
    protected TestCases<int[], Integer> genTestCases() {
        return new MaxAreaTestCases();
    }

}
