package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class MaxAreaTestCases extends TestCases<int[], Integer> implements TestCaseHandler<int[], Integer> {

    private static final long serialVersionUID = -6428263337312378559L;

    public MaxAreaTestCases(){
        addTestCase("Test 1", new int[]{2,3,2,1}, 4);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, Integer output) {
        return this.add(new TestCase<int[], Integer>(name, input, output));
    }

}
