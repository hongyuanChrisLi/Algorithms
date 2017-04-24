package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.PalindromeNumber;
import testcases.leetcode.PalindromeNumberTestCases;

public class PalindromeNumberServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Boolean> testCases = new PalindromeNumberTestCases();

        Solution<Integer, Boolean> solution = new PalindromeNumber();
        solution.runTests(testCases);

    }

}
