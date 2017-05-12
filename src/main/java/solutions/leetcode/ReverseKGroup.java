package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TwoComposite;
import testcases.leetcode.ReverseKGroupTestCases;

/*
 * 

https://leetcode.com/problems/reverse-nodes-in-k-group/#/description

Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: 1->2->3->4->5

For k = 2, you should return: 2->1->4->3->5

For k = 3, you should return: 3->2->1->4->5


 * 
 * */

public class ReverseKGroup extends Solution<TwoComposite<ListNode, Integer>, ListNode> {

    @Override
    protected ListNode runTest(TwoComposite<ListNode, Integer> input) {
        return this.reverseKGroup(input.var1, input.var2);
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
    protected TestCases<TwoComposite<ListNode, Integer>, ListNode> genTestCases() {
        return new ReverseKGroupTestCases();
    }

    public ListNode reverseKGroup(ListNode head, int k) {
       
        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        start.next = head;
        
        while (true){
            // example S->1->2->3->4->5
            //System.out.println(ListNodeMapper.toString(fast));
            
            for ( int i = 0; i < k && fast != null; i++)
                    fast = fast.next;
            
            if (fast == null) return start.next;
            
            // preserve tail 4->5
            ListNode tail = fast.next;
            // 3 -> null
            fast.next = null;
            
            // worker == 1
            ListNode worker = slow.next;
            // slow -> 3 : S -> 3
            slow.next = fast;
            
            // slow == 1
            slow = worker;
            // worker == 2
            worker = worker.next;
            // slow -> tail : 1 -> 4
            slow.next = tail;
            
            // fast == 1
            fast = slow;
            
            // reverse between 1 and 3
            while (worker != null){
                ListNode next = worker.next;
                worker.next = slow;
                slow = worker;
                worker = next; 
            }
            
            slow = fast;
        }
    }
}
