package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class IntegerToRoman extends Solution<Integer, String> {

    @Override
    protected String runTest(Integer input) {
        return intToRoman(input);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }
    
    public String intToRoman(int num) {
        return "";
    }
}
