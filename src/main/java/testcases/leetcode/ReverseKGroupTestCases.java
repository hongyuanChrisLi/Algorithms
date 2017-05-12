package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class ReverseKGroupTestCases extends TestCases<TwoComposite<ListNode, Integer>, ListNode>
        implements TwoCompositeTestCaseHandler<int[], Integer, int[]> {

    private static final long serialVersionUID = 4718097729543353034L;

    public ReverseKGroupTestCases(){
        addTestCase("Test Example 1", new int[]{1,2,3,4,5}, 2, new int[]{2,1,4,3,5});
        addTestCase("Test Example 2", new int[]{1,2,3,4,5}, 3, new int[]{3,2,1,4,5});
    }
    
    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, int[] output) {
        return this.add(new TestCase<TwoComposite<ListNode, Integer>, ListNode>(
                name, 
                new TwoComposite<ListNode, Integer>(ListNodeMapper.toListNode(input1), input2),
                ListNodeMapper.toListNode(output)));
    }

}
