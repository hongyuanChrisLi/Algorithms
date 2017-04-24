package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.ZigZagConvert;
import structures.TwoComposite;
import testcases.leetcode.ZigZagConvertTestCases;

public class ZigZagConvertServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<TwoComposite<String, Integer>, String> testCases = new ZigZagConvertTestCases();

        Solution<TwoComposite<String, Integer>, String> solution = new ZigZagConvert();
        solution.runTests(testCases);
    }

}
