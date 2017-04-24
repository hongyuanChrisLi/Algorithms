package services.leetcode;

import base.Solution;
import base.SolutionService;
import solutions.leetcode.TwoSum;
import structures.IntArrayInt;
import testcases.leetcode.TwoSumTestCases;

public class TwoSumServiceImpl extends SolutionService {

    @Override
    public void run() {
        Solution<IntArrayInt, int[]> solution = new TwoSum();
        solution.runTests(new TwoSumTestCases()); 
    }

}
