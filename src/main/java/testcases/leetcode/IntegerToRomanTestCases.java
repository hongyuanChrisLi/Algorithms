package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class IntegerToRomanTestCases extends TestCases<Integer, String> implements TestCaseHandler<Integer, String> {

    private static final long serialVersionUID = -8507563458149683533L;

    public IntegerToRomanTestCases(){
        addTestCase("Test 1", 1, "I");
        addTestCase("Test 2", 2, "II");
        addTestCase("Test 4", 4, "IV");
        addTestCase("Test 5", 5, "V");
        addTestCase("Test 7", 7, "VII");
        addTestCase("Test 9", 9, "IX");
        addTestCase("Test 10", 10, "X");
        addTestCase("Test 15", 15, "XV");
        addTestCase("Test 39", 39, "XXXIX");
        addTestCase("Test 40", 40, "XL");
        addTestCase("Test 49", 49, "XLIX");
        addTestCase("Test 51", 51, "LI");
        addTestCase("Test 3999", 3999, "MMMCMXCIX");
        addTestCase("Test 1245", 1245, "MCCXLV");
        addTestCase("Test 555", 555, "DLV");
        addTestCase("Test 179", 179, "CLXXIX");
        

        
    }
    
    @Override
    public boolean addTestCase(String name, Integer input, String output) {
        return this.add(new TestCase<Integer, String>(name, input, output));
    }

}
