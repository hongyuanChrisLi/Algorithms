package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.RmElementsTestCases;

/*
 * 
https://leetcode.com/problems/remove-element/#/description

Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 * 
 * */

public class RmElements extends Solution<TwoComposite<int[], Integer>, Integer> {

    @Override
    protected Integer runTest(TwoComposite<int[], Integer> input) {
        return this.removeElement(input.var1, input.var2);
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
    protected TestCases<TwoComposite<int[], Integer>, Integer> genTestCases() {
        return new RmElementsTestCases();
    }

    public int removeElement(int[] nums, int val) {
        
        int len = nums.length;
        int k = 0;
        
        for (int i = 0; i < len; i++ ){
            if (nums[i] != val) nums[k++] = nums[i];
        }
        
        return k;
    }
}
