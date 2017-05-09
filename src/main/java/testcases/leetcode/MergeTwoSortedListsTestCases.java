package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class MergeTwoSortedListsTestCases extends TestCases<TwoComposite<ListNode, ListNode>, ListNode>
        implements TwoCompositeTestCaseHandler<ListNode, ListNode, ListNode> {

    private static final long serialVersionUID = 3212337608798444663L;

    public MergeTwoSortedListsTestCases(){
        addTestCase("Test 1", 
                ListNodeMapper.toListNode(new int[]{1,2,5}),
                ListNodeMapper.toListNode(new int[]{3,4,6}),
                ListNodeMapper.toListNode(new int[]{1,2,3,4,5,6})
                );
        addTestCase("Test 2", 
                ListNodeMapper.toListNode(new int[]{}),
                ListNodeMapper.toListNode(new int[]{3,4,6}),
                ListNodeMapper.toListNode(new int[]{3,4,6})
                );
        addTestCase("Test 3", 
                ListNodeMapper.toListNode(new int[]{2}),
                ListNodeMapper.toListNode(new int[]{3}),
                ListNodeMapper.toListNode(new int[]{2,3})
                );
    }
    
    @Override
    public boolean addTestCase(String name, ListNode input1, ListNode input2, ListNode output) {
        return this.add(new TestCase<TwoComposite<ListNode, ListNode>, ListNode>(
                name, 
                new TwoComposite<ListNode, ListNode>(input1, input2),
                output));
    }

}
