package testcases.leetcode;

import java.util.Arrays;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class PhoneNumToLettersTestCases extends TestCases<String, List<String>>
        implements TestCaseHandler<String, List<String>> {

    private static final long serialVersionUID = 6780906148788714168L;

    public PhoneNumToLettersTestCases() {
        addTestCase("Test Example", "23", 
                Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }
    
    @Override
    public boolean addTestCase(String name, String input, List<String> output) {
        return this.add(new TestCase<String, List<String>>(name, input, output));
    }

}
