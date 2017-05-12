package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.RmDuplicatesTestCases;

/*
 * 
https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
It doesn't matter what you leave beyond the new length.

 * 
 * */

public class RmDuplicates extends Solution<int[], Integer> {

    @Override
    protected Integer runTest(int[] input) {
        return this.removeDuplicates(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    @Override
    protected TestCases<int[], Integer> genTestCases() {
        return new RmDuplicatesTestCases();
    }

    public int removeDuplicates(int[] nums) {
        
        
        int len = nums.length;
        if (len == 0) return 0;
        int k = 0;
        
        for (int i = 1; i < len; i++){
            if (nums[i] != nums[k])
                nums[++k] = nums[i];
        }
        return k + 1;
    }
}
