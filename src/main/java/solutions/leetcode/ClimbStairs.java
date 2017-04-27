package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class ClimbStairs extends Solution<Integer, Integer> {

    @Override
    protected Integer runTest(Integer input) {
        return this.climbStairs(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int climbStairs(int n) {
        return 0;
    }
}
