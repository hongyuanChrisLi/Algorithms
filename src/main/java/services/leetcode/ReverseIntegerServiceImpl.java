package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.ReverseInteger;
import testcases.leetcode.ReverseIntegerTestCases;


public class ReverseIntegerServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Integer> testCases = new ReverseIntegerTestCases();

        Solution<Integer, Integer> solution = new ReverseInteger();
        solution.runTests(testCases);

    }

}
