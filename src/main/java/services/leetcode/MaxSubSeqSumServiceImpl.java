package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.MaxSubSeqSumBtmUp;
import solutions.leetcode.MaxSubSeqSumOptimal;
import testcases.leetcode.MaxSubSeqSumTestCases;

public class MaxSubSeqSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<int[], Integer> testCases = new MaxSubSeqSumTestCases();
        new MaxSubSeqSumBtmUp().runTests(testCases);
        new MaxSubSeqSumOptimal().runTests(testCases);
    }

}
