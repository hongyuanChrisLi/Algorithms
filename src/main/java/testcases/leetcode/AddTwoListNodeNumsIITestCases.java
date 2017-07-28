package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.ListNodeListNode;
import structures.TestCase;

public class AddTwoListNodeNumsIITestCases extends TestCases<ListNodeListNode, ListNode> {

  public AddTwoListNodeNumsIITestCases() {
    this.add(
        new TestCase<ListNodeListNode, ListNode>(
            "Test 1",
            new ListNodeListNode(
                ListNodeMapper.toListNode(new int[]{7, 2, 4, 3}),
                ListNodeMapper.toListNode(new int[]{5, 6, 4})
            ),
            ListNodeMapper.toListNode(new int[]{7, 8, 0, 7})
        )
    );

    this.add(
        new TestCase<ListNodeListNode, ListNode>(
            "Test Long List B",
            new ListNodeListNode(
                ListNodeMapper.toListNode(new int[]{4, 6, 5}),
                ListNodeMapper.toListNode(new int[]{3, 7, 1, 4, 9, 8, 1, 2, 3, 5, 3, 6})),
            ListNodeMapper.toListNode(new int[]{3, 7, 1, 4, 9, 8, 1, 2, 4, 0, 0, 1})));
    this.add(
        new TestCase<ListNodeListNode, ListNode>(
            "Test New Node",
            new ListNodeListNode(
                ListNodeMapper.toListNode(new int[]{9, 9, 9}),
                ListNodeMapper.toListNode(new int[]{1})),
            ListNodeMapper.toListNode(new int[]{1, 0, 0, 0})));
  }


}