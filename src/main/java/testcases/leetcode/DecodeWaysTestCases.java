package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class DecodeWaysTestCases extends TestCases<String, Integer> implements TestCaseHandler<String, Integer> {
    
    private static final long serialVersionUID = -8362404441901239122L;

    public DecodeWaysTestCases(){
        addTestCase("Test Example 1", "12", 2);
        addTestCase("Test No.2", "12345", 3);
        addTestCase("Test 0 Start", "012", 0);
        addTestCase("Test 10", "10", 1);
        addTestCase("Test 210", "210", 1);
        addTestCase("Test 2101", "2101", 1);
        addTestCase("Test 1310", "1310", 2);
        addTestCase("Test Invalid 0", "130", 0);
        addTestCase("Test 111", "111", 3);
        addTestCase("Test 1111", "1111", 5);
        addTestCase("Test 12121", "12121", 8);
        addTestCase("Test 13121", "13121", 6);
        addTestCase("Test 13127", "13127", 4);
        addTestCase("Test 131210", "131210", 4);
        addTestCase("Test 100", "100", 0);
    }
    
    @Override
    public boolean addTestCase(String name, String input, Integer output) {
        return this.add(new TestCase<String, Integer>(name, input, output));
    }

}
