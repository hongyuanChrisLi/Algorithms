package testcases.leetcode;

import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TestCase;
import structures.TestCaseHandler;

public class MergeKListsTestCases extends TestCases<ListNode[], ListNode>
        implements TestCaseHandler<int[][], int[]> {

    private static final long serialVersionUID = -6932528353166597800L;

    public MergeKListsTestCases(){
        addTestCase("Test 1", 
                new int[][]{{1,2,7},{3,5,6},{4,8,9}},
                new int[]{1,2,3,4,5,6,7,8,9}
                );
        
        addTestCase("Test 2", 
                new int[][]{{1},{3},{4},{2,3}},
                new int[]{1,2,3,3,4}
                );
        addTestCase("Test 3", 
                new int[][]{{1},{},{4},{2,3}},
                new int[]{1,2,3,4}
                );
        addTestCase("Test 4", 
                new int[][]{},
                new int[]{}
                );
    }
    
    @Override
    public boolean addTestCase(String name, int[][] input, int[] output) {
        int inLstLen = input.length;
        ListNode[] inLst = new ListNode[inLstLen];
        for (int i = 0; i < inLstLen; i++)
            inLst[i] = ListNodeMapper.toListNode(input[i]);

        return this.add(new TestCase<ListNode[], ListNode>(name, inLst, ListNodeMapper.toListNode(output)));
    }

}
