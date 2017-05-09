package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TwoComposite;
import testcases.leetcode.MergeTwoSortedListsTestCases;

public class MergeTwoSortedLists extends Solution<TwoComposite<ListNode, ListNode>, ListNode> {

    @Override
    protected ListNode runTest(TwoComposite<ListNode, ListNode> input) {
        return mergeTwoLists(input.var1, input.var2);
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
    protected TestCases<TwoComposite<ListNode, ListNode>, ListNode> genTestCases() {
        return new MergeTwoSortedListsTestCases();
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return null;
    }
    
}
