package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.ReverseInteger;
import testcases.ReverseIntegerTestCases;


public class ReverseIntegerServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Integer> testCases = new ReverseIntegerTestCases();

        Solution<Integer, Integer> solution = new ReverseInteger();
        solution.runTests(testCases);

    }

}
