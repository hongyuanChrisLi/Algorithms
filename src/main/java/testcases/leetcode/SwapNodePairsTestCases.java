package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TestCase;
import structures.TestCaseHandler;

public class SwapNodePairsTestCases extends TestCases<ListNode, ListNode> implements TestCaseHandler<int[], int[]> {

    private static final long serialVersionUID = 8756502335941483415L;
    
    public SwapNodePairsTestCases(){
        addTestCase("Test Example", new int[]{1,2,3,4}, new int[]{2,1,4,3});
        addTestCase("Test 2", new int[]{1,2,3,4,5}, new int[]{2,1,4,3,5});
        addTestCase("Test 3", new int[]{1,2}, new int[]{2,1});
        addTestCase("Test 4", new int[]{4}, new int[]{4});
        addTestCase("Test 5", new int[]{}, new int[]{});
    }

    @Override
    public boolean addTestCase(String name, int[] input, int[] output) {
        return this.add(new TestCase<ListNode, ListNode>(name, 
                ListNodeMapper.toListNode(input),
                ListNodeMapper.toListNode(output)));
    }

}
