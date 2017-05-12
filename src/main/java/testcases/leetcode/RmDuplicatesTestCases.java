package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class RmDuplicatesTestCases extends TestCases<int[], Integer> implements TestCaseHandler<int[], Integer> {

    private static final long serialVersionUID = 4893888366905480985L;

    public RmDuplicatesTestCases(){
        addTestCase("Test 1", new int[]{1,2,2,2,3}, 3);
        addTestCase("Test 2", new int[]{}, 0);
        addTestCase("Test 3", new int[]{1}, 1);
        addTestCase("Test 3", new int[]{4,4,4,4,4}, 1);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, Integer output) {
        return this.add(new TestCase<int[], Integer>(name, input, output));
    }

}
