package services;

import base.Solution;
import base.SolutionService;
import solutions.MedianTwoSortedArrays;
import structures.IntArrayIntArray;
import testcases.MedianTwoSortedArraysTestCases;

public class MedianTwoSortedArraysServiceImpl extends SolutionService {

    @Override
    public void run() {
        Solution<IntArrayIntArray, Double> solution = new MedianTwoSortedArrays();
        solution.runTests(new MedianTwoSortedArraysTestCases()); 

    }

}
