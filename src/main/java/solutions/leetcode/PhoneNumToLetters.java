package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import base.Solution;
import base.TestCases;
import testcases.leetcode.PhoneNumToLettersTestCases;

public class PhoneNumToLetters extends Solution<String, List<String>> {

    @Override
    protected List<String> runTest(String input) {
        return this.letterCombinations(input);
    }

    @Override
    protected void printOutputData(List<String> output) {
        System.out.println(output.toString());
    }

    @Override
    protected void testOutput(List<String> outputTest, List<String> output) {
        Set<String> setTest = new HashSet<String>(outputTest);
        Set<String> setOutput = new HashSet<String>(output);
        assertEquals(setTest, setOutput);
    }

    
    public List<String> letterCombinations(String digits) {
        return null;
    }

    @Override
    protected TestCases<String, List<String>> genTestCases() {
        return new PhoneNumToLettersTestCases();
    }
}
