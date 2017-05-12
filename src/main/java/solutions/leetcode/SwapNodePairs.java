package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import testcases.leetcode.SwapNodePairsTestCases;

/*
 * 

https://leetcode.com/problems/swap-nodes-in-pairs/#/description

Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. 
You may not modify the values in the list, 
    only nodes itself can be changed.


 * 
 * */

public class SwapNodePairs extends Solution<ListNode, ListNode> {

    @Override
    protected ListNode runTest(ListNode input) {
        return swapPairs(input);
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
    protected TestCases<ListNode, ListNode> genTestCases() {
        return new SwapNodePairsTestCases();
    }

    public ListNode swapPairs(ListNode head) {
        
        ListNode start = new ListNode(0);
        ListNode preLeft = start, preRight = head;
        start.next = head;
        
        while (preRight != null && preRight.next != null) {
            preLeft.next = preRight.next;
            preLeft = preLeft.next;
            
            preRight.next = preLeft.next;
            preLeft.next = preRight;
            
            preLeft = preLeft.next;
            preRight = preRight.next;
        }
        
        return start.next;
    }
}
