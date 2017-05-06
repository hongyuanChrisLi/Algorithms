package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class MaxCommonPrefix extends Solution<String[], String> {

    @Override
    protected String runTest(String[] input) {
        return this.longestCommonPrefix(input);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }

    public String longestCommonPrefix(String[] strs) {
     
        return "";
    }
    
}
