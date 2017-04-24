package solutions.leetcode;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.HashMap;

import base.Solution;
import structures.IntArrayInt;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * 
 * */

public class TwoSum extends Solution<IntArrayInt, int[]> {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        int len = nums.length;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }
        }
        return res;
    }

    @Override
    protected int[] runTest(IntArrayInt input) {
        return this.twoSum(input.numArray, input.num);
    }

    @Override
    protected void printOutputData(int[] output) {
        System.out.println(Arrays.toString(output));
    }

    @Override
    protected void testOutput(int[] outputTest, int[] output) {
        assertArrayEquals(outputTest, output);
    }

}
