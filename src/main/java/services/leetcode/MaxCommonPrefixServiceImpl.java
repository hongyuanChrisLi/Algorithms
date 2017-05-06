package services.leetcode;

import base.SolutionService;
import solutions.leetcode.MaxCommonPrefix;
import testcases.leetcode.MaxCommonPrefixTestCases;

public class MaxCommonPrefixServiceImpl extends SolutionService {

    @Override
    public void run() {
        new MaxCommonPrefix().runTests(new MaxCommonPrefixTestCases());
    }

}
