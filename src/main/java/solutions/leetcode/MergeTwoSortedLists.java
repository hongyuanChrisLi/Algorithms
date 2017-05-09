package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TwoComposite;
import testcases.leetcode.MergeTwoSortedListsTestCases;

/*
 * 
https://leetcode.com/problems/merge-two-sorted-lists/#/description

Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.

 * */

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
        
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode start = new ListNode(0);
        ListNode worker = start;
        
        while ( l1 != null && l2 != null ) {
            
            if (l1.val < l2.val) {
                worker.next = l1;
                l1 = l1.next;
            } else {
                worker.next = l2;
                l2 = l2.next;
            }
            worker = worker.next;
        }
        
        if (l1 != null) worker.next = l1;
        if (l2 != null) worker.next = l2;
        
        return start.next;
    }
    
}
