package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import testcases.leetcode.MergeKListsTestCases;

public class MergeKLists extends Solution<ListNode[], ListNode> {

    @Override
    protected ListNode runTest(ListNode[] input) {
        return this.mergeKLists(input);
    }

    @Override
    protected void printOutputData(ListNode output) {
        System.out.println(ListNodeMapper.toString(output));
    }

    @Override
    protected void testOutput(ListNode outputTest, ListNode output) {
        assertEquals( ListNodeMapper.toString(outputTest), ListNodeMapper.toString(output));
        
    }

    @Override
    protected TestCases<ListNode[], ListNode> genTestCases() {
        return new MergeKListsTestCases();
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }
}
