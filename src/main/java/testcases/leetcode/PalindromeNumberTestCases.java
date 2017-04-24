package testcases.leetcode;

import base.TestCases;
import structures.TestCase;

public class PalindromeNumberTestCases extends TestCases<Integer, Boolean> {

    private static final long serialVersionUID = 448544376120377323L;
    
    public PalindromeNumberTestCases () {
        this.add(new TestCase<Integer, Boolean>("Test 1", 123, false));
        this.add(new TestCase<Integer, Boolean>("Test 2", 121, true));
        this.add(new TestCase<Integer, Boolean>("Test Single digit", 1, true));
        this.add(new TestCase<Integer, Boolean>("Test Two digits True", 22, true));
        this.add(new TestCase<Integer, Boolean>("Test Two digits False", 45, false));
        this.add(new TestCase<Integer, Boolean>("Test Negative True", -2332, false));
        this.add(new TestCase<Integer, Boolean>("Test Negative False", -23542, false));
        this.add(new TestCase<Integer, Boolean>("Test Zero", 0, true));
        this.add(new TestCase<Integer, Boolean>("Test Large Number True", 2147447412, true));
        this.add(new TestCase<Integer, Boolean>("Test Large Number False", -2147457412, false));
        this.add(new TestCase<Integer, Boolean>("Test Large Number False", -2147483648, false));
        this.add(new TestCase<Integer, Boolean>("Test with trailing zeros", 10, false));
        
    }

}
