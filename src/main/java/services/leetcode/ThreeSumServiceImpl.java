package services.leetcode;

import base.SolutionService;
import solutions.leetcode.ThreeSum;
import testcases.leetcode.ThreeSumTestCases;

public class ThreeSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        new ThreeSum().runTests(new ThreeSumTestCases());
    }

}
