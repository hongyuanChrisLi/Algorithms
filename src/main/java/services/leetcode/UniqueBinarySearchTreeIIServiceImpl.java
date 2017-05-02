package services.leetcode;

import java.util.List;

import base.SolutionService;
import base.TestCases;
import solutions.leetcode.UniqueBinarySearchTreeII;
import structures.TreeNode;
import testcases.leetcode.UniqueBinarySearchTreeIITestCases;

public class UniqueBinarySearchTreeIIServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<Integer, List<TreeNode>> testCases = new UniqueBinarySearchTreeIITestCases();
        new UniqueBinarySearchTreeII().runTests(testCases);
    }

}
