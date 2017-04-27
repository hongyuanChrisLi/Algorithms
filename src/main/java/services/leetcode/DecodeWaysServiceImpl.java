package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.DecodeWays;
import testcases.leetcode.DecodeWaysTestCases;

public class DecodeWaysServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, Integer> testCases = new DecodeWaysTestCases();
        new DecodeWays().runTests(testCases);

    }

}
