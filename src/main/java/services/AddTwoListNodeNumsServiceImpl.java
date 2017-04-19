package services;

import base.Solution;
import base.SolutionService;
import base.TestCases;
import solutions.AddTwoListNodeNums;
import solutions.AddTwoListNodeNumsOptimized;
import structures.ListNode;
import structures.ListNodeListNode;
import testcases.AddTwoListNodeNumsTestCases;

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
