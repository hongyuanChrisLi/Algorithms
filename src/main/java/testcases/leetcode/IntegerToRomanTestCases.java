package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class IntegerToRomanTestCases extends TestCases<Integer, String> implements TestCaseHandler<Integer, String> {

    private static final long serialVersionUID = -8507563458149683533L;

    public IntegerToRomanTestCases(){
        addTestCase("Test Basic", 5, "V");
    }
    
    @Override
    public boolean addTestCase(String name, Integer input, String output) {
        return this.add(new TestCase<Integer, String>(name, input, output));
    }

}
