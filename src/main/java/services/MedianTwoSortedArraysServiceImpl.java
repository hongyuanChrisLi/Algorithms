package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.MedianTwoSortedArrays;
import solutions.MedianTwoSortedArraysBestSolution;
import structures.IntArrayIntArray;
import testcases.MedianTwoSortedArraysTestCases;

public class MedianTwoSortedArraysServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<IntArrayIntArray, Double> testCases = new MedianTwoSortedArraysTestCases();
        
        Solution<IntArrayIntArray, Double> solution = new MedianTwoSortedArrays();
        solution.runTests(testCases); 

        solution = new MedianTwoSortedArraysBestSolution();
        solution.runTests(testCases);
        
    }

}
