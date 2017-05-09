package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import mappers.ListNodeMapper;
import structures.ListNode;
import structures.TwoComposite;
import testcases.leetcode.RmNthFromEndTestCases;

public class RmNthFromEnd extends Solution<TwoComposite<ListNode, Integer>, ListNode> {

    @Override
    protected ListNode runTest(TwoComposite<ListNode, Integer> input) {
        return removeNthFromEnd(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(ListNode output) {
        System.out.println(ListNodeMapper.toString(output));
    }

    @Override
    protected void testOutput(ListNode outputTest, ListNode output) {
        assertEquals( ListNodeMapper.toString(outputTest), ListNodeMapper.toString(output));
    }

    @Override
    protected TestCases<TwoComposite<ListNode, Integer>, ListNode> genTestCases() {
        return new RmNthFromEndTestCases();
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return null;
    }

}
