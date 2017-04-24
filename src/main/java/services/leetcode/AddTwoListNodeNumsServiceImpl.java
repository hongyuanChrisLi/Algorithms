package services.leetcode;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.leetcode.AddTwoListNodeNums;
import solutions.leetcode.AddTwoListNodeNumsOptimized;
import structures.ListNode;
import structures.ListNodeListNode;
import testcases.leetcode.AddTwoListNodeNumsTestCases;

public class AddTwoListNodeNumsServiceImpl extends SolutionService {

    @Override
    public void run() {
        TestCases<ListNodeListNode, ListNode> testCases = new AddTwoListNodeNumsTestCases();
        Solution<ListNodeListNode, ListNode> solution = new AddTwoListNodeNums();
        solution.runTests(testCases); 
        
        testCases = new AddTwoListNodeNumsTestCases();
        solution = new AddTwoListNodeNumsOptimized();
        solution.runTests(testCases); 
    }

}
