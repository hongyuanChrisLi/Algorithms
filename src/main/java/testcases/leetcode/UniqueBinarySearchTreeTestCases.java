package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class UniqueBinarySearchTreeTestCases extends TestCases<Integer, Integer> implements TestCaseHandler<Integer, Integer> {

    private static final long serialVersionUID = -689917886061001408L;

    public UniqueBinarySearchTreeTestCases(){
        addTestCase("Test N = 2", 2, 2);
        addTestCase("Test N = 3", 3, 5);
        addTestCase("Test N = 4", 4, 14);
    }
    
    @Override
    public boolean addTestCase(String name, Integer input, Integer output) {
        return this.add(new TestCase<Integer, Integer>(name, input, output));
    }

}
