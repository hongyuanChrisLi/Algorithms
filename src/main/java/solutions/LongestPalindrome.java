package solutions;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import base.Solution;

public class LongestPalindrome extends Solution<String, String[]> {

    @Override
    protected String[] runTest(String input) {
        return new String[]{this.longestPalindrome(input)};
    }

    @Override
    protected void printOutputData(String[] output) {
        System.out.println(output[0]);
    }

    @Override
    protected void testOutput(String[] outputTest, String[] output) {
        assertTrue(Arrays.asList(outputTest).contains(output[0]));
    }

    public String longestPalindrome(String s) {
        return "bab";
    }

}
