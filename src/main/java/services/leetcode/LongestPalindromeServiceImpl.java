package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.LongestPalindrome;
import solutions.leetcode.LongestPalindromeManacher;
import testcases.leetcode.LongestPalindromeTestCases;

public class LongestPalindromeServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, String[]> testCases = new LongestPalindromeTestCases();

        Solution<String, String[]> solution = new LongestPalindrome();
        solution.runTests(testCases);
        
        solution = new LongestPalindromeManacher();
        solution.runTests(testCases);
    }

}
