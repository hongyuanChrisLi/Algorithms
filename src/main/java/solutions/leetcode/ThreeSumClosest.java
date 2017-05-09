package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import base.Solution;
import structures.TwoComposite;

/*
 * 
https://leetcode.com/problems/3sum-closest/#/description

Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers. 
You may assume that each input would have exactly one solution.

    For example, given array S = {-1 2 1 -4}, and target = 1.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

 * 
 * */

public class ThreeSumClosest extends Solution<TwoComposite<int[], Integer>, Integer> {

    @Override
    protected Integer runTest(TwoComposite<int[], Integer> input) {
        return this.threeSumClosest(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int upperLim = nums.length - 2;
        int minDist = Integer.MAX_VALUE;
        int res = 0;
        
        for (int i = 0; i < upperLim; i++) {
            int lo = i + 1;
            int hi = upperLim + 1;
            
            while (lo < hi) {
                int threeSum = nums[i] + nums[lo] + nums[hi];
                int dist = Math.abs(threeSum - target);
                
                if ( dist < minDist) {
                    minDist = dist;
                    res = threeSum;
                }
                
                if (threeSum > target) hi--; 
                else lo++;
            }
        }

        return res;
    }
}
