package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.MaxSubSeqSumBtmUp;
import testcases.leetcode.MaxSubSeqSumTestCases;

public class MaxSubSeqSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<int[], Integer> testCases = new MaxSubSeqSumTestCases();
        new MaxSubSeqSumBtmUp().runTests(testCases);
    }

}
