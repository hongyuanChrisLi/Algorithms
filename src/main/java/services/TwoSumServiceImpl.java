package services;

import base.Solution;
import base.SolutionService;
import solutions.TwoSum;
import structures.IntArrayInt;
import testcases.TwoSumTestCases;

public class TwoSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        Solution<IntArrayInt, int[]> solution = new TwoSum();
        solution.runTests(new TwoSumTestCases()); 
    }

}
