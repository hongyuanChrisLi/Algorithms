package services.leetcode;

import base.SolutionService;
import solutions.leetcode.ThreeSumClosest;
import testcases.leetcode.ThreeSumClosestTestCases;

public class ThreeSumClosestServiceImpl extends SolutionService {

    @Override
    public void run() {
        new ThreeSumClosest().runTests(new ThreeSumClosestTestCases());
    }

}
