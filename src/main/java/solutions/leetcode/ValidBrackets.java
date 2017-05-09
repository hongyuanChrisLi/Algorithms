package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

import base.Solution;
import base.TestCases;
import testcases.leetcode.ValidBracketsTestCases;

public class ValidBrackets extends Solution<String, Boolean> {

    @Override
    protected Boolean runTest(String input) {
        return this.isValid(input);
    }

    @Override
    protected void printOutputData(Boolean output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Boolean outputTest, Boolean output) {
        assertEquals(outputTest, output);
    }

    @Override
    protected TestCases<String, Boolean> genTestCases() {
        return new ValidBracketsTestCases();
    }
    
    public boolean isValid(String s) {
        
        char[] lkp = new char[128];
        lkp['}'] = '{';
        lkp[')'] = '(';
        lkp[']'] = '[';
        //lkp['>'] = '<';
        
        LinkedList<Character> stack = new LinkedList<Character>();
        
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (lkp[c] == 0) 
                stack.push(c);
            else if (stack.isEmpty() || lkp[c] != stack.getFirst())
                return false;
            else stack.pop();
        }
        
        return stack.isEmpty();
    }

}
