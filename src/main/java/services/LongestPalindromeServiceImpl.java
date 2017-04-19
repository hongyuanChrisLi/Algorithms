package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.LongestPalindrome;
import testcases.LongestPalindromeTestCases;

public class LongestPalindromeServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, String[]> testCases = new LongestPalindromeTestCases();

        Solution<String, String[]> solution = new LongestPalindrome();
        solution.runTests(testCases);

    }

}
