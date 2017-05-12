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
        int lstLen = lists.length;
        if (lstLen < 1) return null;
        merge(lists, 0, lstLen-1);
        return lists[0];
    }
    
    private void merge(ListNode[] lists, int left, int right){
        
        if (left >= right) return;
        int mid = ( left + right ) / 2;
        
        merge(lists, left, mid);
        merge(lists, mid + 1, right);
        
        ListNode leftNode = lists[left];
        ListNode rightNode = lists[mid+1];
        ListNode start = new ListNode(0);
        ListNode curNode = start ;
        
        while (leftNode != null && rightNode != null){
            if (leftNode.val < rightNode.val){
                curNode.next = leftNode;
                leftNode = leftNode.next;
            } else {
                curNode.next = rightNode;
                rightNode = rightNode.next;
            }
            curNode = curNode.next;
        }
        
        if (leftNode != null) curNode.next = leftNode;
        else if (rightNode != null) curNode.next = rightNode;
        
        lists[left] = start.next;
    }
}
