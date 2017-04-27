package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class MaxSubSeqSumTestCases extends TestCases<int[], Integer> implements TestCaseHandler<int[], Integer> {
    private static final long serialVersionUID = 1641012339888220843L;

    public MaxSubSeqSumTestCases() {
        addTestCase("Test Example", new int[]{-2,1,-3,4,-1,2,1,-5,4}, 6);
        addTestCase("Test Zero Length", new int[]{}, Integer.MIN_VALUE);
        addTestCase("Test One value", new int[]{1}, 1);
        addTestCase("Test All Positive", new int[]{4, 2, 4, 6, 2}, 18);
        addTestCase("Test All Negative", new int[]{-7, -2, -4, -6, -2}, -2);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, Integer output) {
        return this.add(new TestCase<int[], Integer>(name, input, output));
    }

}
