package services;

import solutions.Solution;
import solutions.TwoSum;
import structures.IntArrayInt;
import testcases.TwoSumTestCases;

public class TwoSumServiceImpl implements SolutionService {

    @Override
    public void run() {
        Solution<IntArrayInt, int[]> solution = new TwoSum();
        solution.runTests(new TwoSumTestCases()); 
    }

}
