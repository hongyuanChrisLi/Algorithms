package app;

import solutions.Solution;
import solutions.TwoSum;
import structures.IntArrayInt;
import testcases.TwoSumTestCases;

public class Main {
    public static void main(String[] args) {
        Solution<IntArrayInt, int[]> solution = new TwoSum();
        solution.runTests(new TwoSumTestCases()); 
    }
}
