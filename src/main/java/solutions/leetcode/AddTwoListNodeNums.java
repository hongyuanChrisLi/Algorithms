package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.ListNodeListNode;

/*
 * 
https://leetcode.com/problems/add-two-numbers/#/description

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

 * 
 * */

public class AddTwoListNodeNums extends Solution<ListNodeListNode, ListNode> {

    @Override
    protected ListNode runTest(ListNodeListNode input) {
        return this.addTwoNumbers(input.listNodeA, input.listNodeB);
    }

    @Override
    protected void printOutputData(ListNode output) {
        System.out.println(ListNodeMapper.toString(output));
    }

    @Override
    protected void testOutput(ListNode outputTest, ListNode output) {
        assertEquals( ListNodeMapper.toString(outputTest), ListNodeMapper.toString(output));
    }
    
    ListNode head, tail;
    int carryOver;
    int sum, val;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        head = null;
        tail = null;
        carryOver = 0;
        
        while ( l1 != null && l2 != null) {
            sum = l1.val + l2.val + carryOver;
            val = sum % 10;
            carryOver = sum / 10;
            
            ListNode node = new ListNode(val);
            
            if ( head == null) {
                head = node;
                tail = head;
            } else {
                tail.next = node;
                tail = node;
            }
            
            l1 = l1.next;
            l2 = l2.next;
        }
        
        processRest(l1);
        processRest(l2);
        
        if (carryOver > 0)
            tail.next = new ListNode(carryOver);
        
        return head;
    }
    
    private void processRest(ListNode node) {
        
        int sum, val;
        
        while (carryOver > 0 && node != null){
            sum = node.val + carryOver;
            val = sum % 10;
            carryOver = sum / 10;
            node.val = val;
            
            tail.next = node;
            tail = node;
            node = node.next;
        }
        
        if ( node != null) {
            tail.next = node;
            tail = node;
        }
    }
}
