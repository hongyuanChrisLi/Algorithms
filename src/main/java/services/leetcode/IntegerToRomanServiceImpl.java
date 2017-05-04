package services.leetcode;

import base.SolutionService;
import solutions.leetcode.IntegerToRoman;
import testcases.leetcode.IntegerToRomanTestCases;

public class IntegerToRomanServiceImpl extends SolutionService {

    @Override
    public void run() {
        new IntegerToRoman().runTests(new IntegerToRomanTestCases());
    }

}
