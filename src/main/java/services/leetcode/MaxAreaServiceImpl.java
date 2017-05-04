package services.leetcode;

import base.SolutionService;
import solutions.leetcode.MaxArea;
import testcases.leetcode.MaxAreaTestCases;

public class MaxAreaServiceImpl extends SolutionService {

    @Override
    public void run() {
        new MaxArea().runTests(new MaxAreaTestCases());
    }

}
