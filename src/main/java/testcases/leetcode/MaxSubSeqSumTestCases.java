package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class MaxSubSeqSumTestCases extends TestCases<int[], Integer> implements TestCaseHandler<int[], Integer> {
    private static final long serialVersionUID = 1641012339888220843L;

    public MaxSubSeqSumTestCases() {
        addTestCase("Test Example", new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, Integer output) {
        return this.add(new TestCase<int[], Integer>(name, input, output));
    }

}
