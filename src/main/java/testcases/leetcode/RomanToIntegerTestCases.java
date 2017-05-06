package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class RomanToIntegerTestCases extends TestCases<String, Integer>
    implements TestCaseHandler<String, Integer>{

    private static final long serialVersionUID = -4289641615865624091L;

    public RomanToIntegerTestCases(){
        addTestCase("Test 1", "I", 1);
        addTestCase("Test 2", "II", 2);
        addTestCase("Test 4", "IV", 4);
        addTestCase("Test 5", "V", 5);
        addTestCase("Test 7", "VII", 7);
        addTestCase("Test 9", "IX", 9);
        addTestCase("Test 10", "X", 10);
        addTestCase("Test 15", "XV", 15);
        addTestCase("Test 39", "XXXIX", 39);
        addTestCase("Test 40", "XL", 40);
        addTestCase("Test 49", "XLIX", 49);
        addTestCase("Test 51", "LI", 51);
        addTestCase("Test 3999", "MMMCMXCIX", 3999);
        addTestCase("Test 1245", "MCCXLV", 1245);
        addTestCase("Test 555", "DLV", 555);
        addTestCase("Test 179", "CLXXIX", 179);
    }
    
    @Override
    public boolean addTestCase(String name, String input, Integer output) {
        return this.add(new TestCase<String, Integer>(name, input, output));
    }

}
