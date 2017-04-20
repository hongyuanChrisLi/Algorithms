package testcases;

import base.TestCases;
import structures.TestCase;

public class StringToIntegerTestCases extends TestCases<String, Integer> {

    private static final long serialVersionUID = -314515597854636659L;
    
    public StringToIntegerTestCases(){    
        this.add(new TestCase<String, Integer>("Test 1", "123", 123));
    }

}
