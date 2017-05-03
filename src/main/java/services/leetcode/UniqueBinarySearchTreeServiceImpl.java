package services.leetcode;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.UniqueBinarySearchTree;
import testcases.leetcode.UniqueBinarySearchTreeTestCases;

public class UniqueBinarySearchTreeServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, Integer> testCases = new UniqueBinarySearchTreeTestCases();
        new UniqueBinarySearchTree().runTests(testCases);
    }

}
