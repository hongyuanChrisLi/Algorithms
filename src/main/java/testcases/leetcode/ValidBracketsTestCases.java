package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class ValidBracketsTestCases extends TestCases<String, Boolean> implements TestCaseHandler<String, Boolean> {

    private static final long serialVersionUID = -7438834775966134992L;

    public ValidBracketsTestCases(){
        addTestCase("Test 1", "{}[({})]", true);
        addTestCase("Test 2", "{}[(})]", false);
    }
    
    @Override
    public boolean addTestCase(String name, String input, Boolean output) {
        return this.add(new TestCase<String, Boolean>(name, input, output));
    }

}
