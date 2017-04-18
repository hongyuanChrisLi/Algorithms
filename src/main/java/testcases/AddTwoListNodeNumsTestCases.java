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
                        new ListNodeListNode(243, 564),
                        ListNodeMapper.toListNode(243)) );
    }
}
