package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class MaxCommonPrefixTestCases extends TestCases<String[], String> implements TestCaseHandler<String[], String> {

    private static final long serialVersionUID = -9074488525402800388L;

    public MaxCommonPrefixTestCases(){
        addTestCase("Basic Test", new String[]{"ABCDE", "ABSFG"}, "AB");
        addTestCase("Test 2", new String[]{"absdet", "abstain", "absolute"}, "abs");
        addTestCase("Empty String", new String[]{"", "abstain", "absolute"}, "");
        addTestCase("Test 4", new String[]{"cabsdet", "abstain", "absolute"}, "");
    }
    
    @Override
    public boolean addTestCase(String name, String[] input, String output) {
        return this.add(new TestCase<String[], String>(name, input, output));
    }

}
