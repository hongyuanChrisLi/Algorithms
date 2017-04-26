package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

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
        
        return 0;
    }
}
