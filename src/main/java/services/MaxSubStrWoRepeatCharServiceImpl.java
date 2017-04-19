package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.MaxSubStrWoRepeatChar;
import testcases.MaxSubStrWoRepeatCharTestCases;

public class MaxSubStrWoRepeatCharServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<String, Integer> testCases = new MaxSubStrWoRepeatCharTestCases();
        
        Solution<String, Integer> solution = new MaxSubStrWoRepeatChar();
        solution.runTests(testCases); 
    }

}
