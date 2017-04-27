package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class DecodeWaysTestCases extends TestCases<String, Integer> implements TestCaseHandler<String, Integer> {
    
    private static final long serialVersionUID = -8362404441901239122L;

    public DecodeWaysTestCases(){
        addTestCase("Test Example 1", "12", 2);
    }
    
    @Override
    public boolean addTestCase(String name, String input, Integer output) {
        return this.add(new TestCase<String, Integer>(name, input, output));
    }

}
