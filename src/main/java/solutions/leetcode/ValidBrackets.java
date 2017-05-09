package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.ValidBracketsTestCases;

public class ValidBrackets extends Solution<String, Boolean> {

    @Override
    protected Boolean runTest(String input) {
        return this.isValid(input);
    }

    @Override
    protected void printOutputData(Boolean output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Boolean outputTest, Boolean output) {
        assertEquals(outputTest, output);
    }

    @Override
    protected TestCases<String, Boolean> genTestCases() {
        return new ValidBracketsTestCases();
    }
    
    public boolean isValid(String s) {
        return false;
    }

}
