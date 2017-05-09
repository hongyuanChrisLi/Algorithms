package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TwoComposite;
import testcases.leetcode.RmNthFromEndTestCases;

public class RmNthFromEnd extends Solution<TwoComposite<ListNode, Integer>, ListNode> {

    @Override
    protected ListNode runTest(TwoComposite<ListNode, Integer> input) {
        return removeNthFromEnd(input.var1, input.var2);
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
        return new RmNthFromEndTestCases();
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode start = new ListNode(0);
        ListNode fast = head, slow = start;
        start.next = head;
        int dist = 0;
        
        while(dist < n && fast != null){
            fast = fast.next;
            dist++;
        }
        
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = dist == n ? slow.next.next : slow.next;
        
        return start.next;
    }
    
    
/*    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode a = head;
        ListNode b = head;
        
        int dist = 0;
        
        while (a != null && dist <= n){
            a = a.next;
            dist++;
        }
        
        while (a != null) {
            a = a.next;
            b = b.next;
        }
        
        if ( dist > n )
            b.next = b.next.next;
        else if (dist == n)
            head = head.next;
            
        return head;
    }*/

}
