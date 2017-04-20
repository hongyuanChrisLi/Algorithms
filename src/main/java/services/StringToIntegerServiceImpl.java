package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.StringToInteger;
import testcases.StringToIntegerTestCases;

public class StringToIntegerServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, Integer> testCases = new StringToIntegerTestCases();

        Solution<String, Integer> solution = new StringToInteger();
        solution.runTests(testCases);
    }

}
