package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.ClimbStairs;
import testcases.leetcode.ClimbStairsTestCases;

public class ClimbStairsServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Integer> testCases = new ClimbStairsTestCases();
        new ClimbStairs().runTests(testCases);
    }

}
