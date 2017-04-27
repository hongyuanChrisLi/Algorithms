package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class DecodeWays extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.numDecodings(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int numDecodings(String s) {
        return 0;
    }

}
