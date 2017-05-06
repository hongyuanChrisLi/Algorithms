package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class RomanToInteger extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.romanToInt(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int romanToInt(String s) {
        return 0;
    }
    
}
