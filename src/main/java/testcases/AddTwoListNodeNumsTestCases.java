package testcases;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.ListNodeListNode;
import structures.TestCase;

public class AddTwoListNodeNumsTestCases extends TestCases<ListNodeListNode, ListNode> {

    private static final long serialVersionUID = -6492576960046132322L;
    
    public AddTwoListNodeNumsTestCases(){
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test Example 1",
                        new ListNodeListNode(342, 465),
                        ListNodeMapper.toListNode(807)));
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test Zeros",
                        new ListNodeListNode(0, 0),
                        ListNodeMapper.toListNode(0)));
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test Long Int A",
                        new ListNodeListNode(234536, 465),
                        ListNodeMapper.toListNode(235001)));
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test Long List B",
                        new ListNodeListNode(
                                ListNodeMapper.toListNode(new int[]{5, 6, 4}), 
                                ListNodeMapper.toListNode(new int[]{6, 3, 5, 4, 3, 2, 1, 8, 9, 1, 7, 3})),
                        ListNodeMapper.toListNode(new int[]{1, 0, 0, 5, 3, 2, 1, 8, 9, 1, 7, 3})));
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test short List B",
                        new ListNodeListNode(
                                ListNodeMapper.toListNode(new int[]{1, 8}), 
                                ListNodeMapper.toListNode(new int[]{0})),
                        ListNodeMapper.toListNode(new int[]{1,8})));
        this.add(
                new TestCase<ListNodeListNode, ListNode>(
                        "Test New Node",
                        new ListNodeListNode(
                                ListNodeMapper.toListNode(new int[]{9, 9, 9}), 
                                ListNodeMapper.toListNode(new int[]{1})),
                        ListNodeMapper.toListNode(new int[]{0, 0, 0, 1})));
    }
}
