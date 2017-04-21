package testcases;

import base.TestCases;
import structures.TestCase;

public class StringToIntegerTestCases extends TestCases<String, Integer> {

    private static final long serialVersionUID = -314515597854636659L;
    
    public StringToIntegerTestCases(){    
        this.add(new TestCase<String, Integer>("Test Basic", "123", 123));
        this.add(new TestCase<String, Integer>("Test - Sign", "-345", -345));
        this.add(new TestCase<String, Integer>("Test + Sign", "+987", 987));
        this.add(new TestCase<String, Integer>("Test Spaces", "   1872", 1872));
        this.add(new TestCase<String, Integer>("Test Space and + Sign", "  +7234", 7234));
        this.add(new TestCase<String, Integer>("Test Space and - Sign", "  -6123", -6123));
        this.add(new TestCase<String, Integer>("Test Multiple Signs", " +-6123", 0));
        this.add(new TestCase<String, Integer>("Test Leading Special Char", " ab123", 0));
        this.add(new TestCase<String, Integer>("Test Trailing Special Char", " 633s09", 633)); 
        this.add(new TestCase<String, Integer>("Test All spaces", "      ", 0)); 
        this.add(new TestCase<String, Integer>("Test Empty String", "", 0));
        this.add(new TestCase<String, Integer>("Test Int + Overflow", "2147483648", 2147483647));
        this.add(new TestCase<String, Integer>("Test Int + Boundary", "2147483647", 2147483647));
        this.add(new TestCase<String, Integer>("Test Int + More Overflow", "2147483655", 2147483647));
        this.add(new TestCase<String, Integer>("Test Int - Overflow", "-2147483649", -2147483648));
        this.add(new TestCase<String, Integer>("Test Int - Boundary", "-2147483648", -2147483648));
        this.add(new TestCase<String, Integer>("Test Int - More Overflow", "-2147484000", -2147483648));
        this.add(new TestCase<String, Integer>("Test Leading Zeros", "-00043", -43));
        this.add(new TestCase<String, Integer>("Test Leading Zero space", "-00 043", 0));
        this.add(new TestCase<String, Integer>("Test Space After Sign", "   - 321", 0));
    }

}
