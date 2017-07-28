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

    ListNode rl1 = reverseLinkedList(l1);
    ListNode rl2 = reverseLinkedList(l2);
    ListNode head = new ListNode(0);
    ListNode pre = head;
    head.next = rl1;

    int carryOver = 0;

    while (rl1 != null && rl2 != null){
      int sum = rl1.val + rl2.val + carryOver;
      carryOver = sum / 10;
      rl1.val= sum % 10;

      pre = rl1;
      rl1 = rl1.next;
      rl2 = rl2.next;
    }

    pre.next = rl1 == null? rl2 : rl1;
    extendList(pre, carryOver);

    // System.out.println(ListNodeMapper.toString(head.next));

    return reverseLinkedList(head.next);
  }

  private void extendList(ListNode pt, int carryOver){
    ListNode pre = pt;
    pt = pt.next;

    while ( pt != null ){
      int sum = pt.val + carryOver;
      pt.val = sum % 10;
      carryOver = sum / 10;
      pre = pt;
      pt = pt.next;
    }

    if (carryOver != 0){
      pre.next = new ListNode(carryOver);
    }
  }

  private ListNode reverseLinkedList(ListNode l1){

    ListNode ptA, ptB;
    // ptA on original list
    // ptB on new list
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