package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.ZigZagConvert;
import structures.StringInt;
import testcases.ZigZagConvertTestCases;

public class ZigZagConvertServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<StringInt, String> testCases = new ZigZagConvertTestCases();

        Solution<StringInt, String> solution = new ZigZagConvert();
        solution.runTests(testCases);
    }

}
