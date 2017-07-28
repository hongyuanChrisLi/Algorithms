package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.ListNodeListNode;
import testcases.leetcode.AddTwoListNodeNumsIITestCases;

public class AddTwoListNodeNumsII extends Solution<ListNodeListNode, ListNode> {

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
    assertEquals(ListNodeMapper.toString(outputTest), ListNodeMapper.toString(output));
  }

  @Override
  protected TestCases<ListNodeListNode, ListNode> genTestCases() {
    return new AddTwoListNodeNumsIITestCases();
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode nl1 = reverseLinkedList(l1);
    ListNode nl2 = reverseLinkedList(l2);

    System.out.println(ListNodeMapper.toString(nl1));
    System.out.println(ListNodeMapper.toString(nl2));

    return null;
  }


  private ListNode reverseLinkedList(ListNode l1){


    ListNode ptA, ptB;
    // ptA on original list
    // ptB on new list
    // ptC temp
    ListNode head = new ListNode(0);
    head.next = l1;
    ptA = l1.next;
    l1.next = null;

    while (ptA != null) {
      ptB = ptA;
      ptA = ptA.next;

      ptB.next = head.next;
      head.next = ptB;
    }

    return head.next;
  }
}