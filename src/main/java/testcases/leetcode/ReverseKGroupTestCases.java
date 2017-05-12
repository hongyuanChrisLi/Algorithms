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
        addTestCase("Test 3", new int[]{1,2,3,4,5,6}, 4, new int[]{4,3,2,1,5,6});
        addTestCase("Test 4", new int[]{1,2,3,4,5,6}, 3, new int[]{3,2,1,6,5,4});
        addTestCase("Test 5", new int[]{1,2,3,4,5,6,7}, 3, new int[]{3,2,1,6,5,4,7});
        addTestCase("Test 6", new int[]{1,2}, 3, new int[]{1,2});
        addTestCase("Test 7", new int[]{}, 3, new int[]{});
    }
    
    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, int[] output) {
        return this.add(new TestCase<TwoComposite<ListNode, Integer>, ListNode>(
                name, 
                new TwoComposite<ListNode, Integer>(ListNodeMapper.toListNode(input1), input2),
                ListNodeMapper.toListNode(output)));
    }

}
