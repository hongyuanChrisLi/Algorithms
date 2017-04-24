package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.StringToInteger;
import testcases.leetcode.StringToIntegerTestCases;

public class StringToIntegerServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, Integer> testCases = new StringToIntegerTestCases();

        Solution<String, Integer> solution = new StringToInteger();
        solution.runTests(testCases);
    }

}
