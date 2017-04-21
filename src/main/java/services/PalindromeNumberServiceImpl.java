package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.PalindromeNumber;
import testcases.PalindromeNumberTestCases;

public class PalindromeNumberServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Boolean> testCases = new PalindromeNumberTestCases();

        Solution<Integer, Boolean> solution = new PalindromeNumber();
        solution.runTests(testCases);

    }

}
