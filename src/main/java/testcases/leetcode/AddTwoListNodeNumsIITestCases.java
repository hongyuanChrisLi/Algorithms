package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.ListNodeListNode;
import structures.TestCase;

public class AddTwoListNodeNumsIITestCases extends TestCases<ListNodeListNode, ListNode>{

    public AddTwoListNodeNumsIITestCases(){
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
    }



}