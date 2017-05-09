package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

/*
 * 
https://leetcode.com/problems/valid-parentheses/#/description
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.



 * 
 * */

public class ValidBracketsTestCases extends TestCases<String, Boolean> implements TestCaseHandler<String, Boolean> {

    private static final long serialVersionUID = -7438834775966134992L;

    public ValidBracketsTestCases(){
        addTestCase("Test 1", "{}[({})]", true);
        addTestCase("Test 2", "{}[(})]", false);
        addTestCase("Test 3", "", true);
        addTestCase("Test 4", "[", false);
        addTestCase("Test 4", "}", false);
    }
    
    @Override
    public boolean addTestCase(String name, String input, Boolean output) {
        return this.add(new TestCase<String, Boolean>(name, input, output));
    }

}
