package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class RmNthFromEndTestCases extends TestCases<TwoComposite<ListNode, Integer>, ListNode>
        implements TwoCompositeTestCaseHandler<ListNode, Integer, ListNode> {

    private static final long serialVersionUID = 6292351945155701451L;

    public RmNthFromEndTestCases(){
        addTestCase("Test Example",
            ListNodeMapper.toListNode(new int[]{1,2,3,4,5}),
            2, 
            ListNodeMapper.toListNode(new int[]{1,2,3,5}));
    }
    
    @Override
    public boolean addTestCase(String name, ListNode input1, Integer input2, ListNode output) {
        return this.add(new TestCase<TwoComposite<ListNode, Integer>, ListNode>(
                name, 
                new TwoComposite<ListNode, Integer>(input1, input2),
                output));
    }

}
