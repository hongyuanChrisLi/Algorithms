package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.MinPathSum;
import testcases.leetcode.MinPathSumTestCases;

public class MinPathSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<int[][], Integer> testCases = new MinPathSumTestCases();
        new MinPathSum().runTests(testCases);

    }

}
