package services.leetcode;

import base.SolutionService;
import solutions.leetcode.RomanToInteger;
import testcases.leetcode.RomanToIntegerTestCases;

public class RomanToIntegerServiceImpl extends SolutionService {

    @Override
    public void run() {
        new RomanToInteger().runTests(new RomanToIntegerTestCases());
    }

}
