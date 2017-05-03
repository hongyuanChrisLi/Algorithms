package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import structures.TwoComposite;

/*
 * 

https://leetcode.com/problems/regular-expression-matching/#/description

Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") → false
isMatch("aa","aa") → true
isMatch("aaa","aa") → false
isMatch("aa", "a*") → true
isMatch("aa", ".*") → true
isMatch("ab", ".*") → true
isMatch("aab", "c*a*b") → true

 * 
 * */

public class RegexMatch extends Solution<TwoComposite<String, String>, Boolean> {

    @Override
    protected Boolean runTest(TwoComposite<String, String> input) {
        return this.isMatch(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(Boolean output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Boolean outputTest, Boolean output) {
        assertEquals(outputTest, output);
    }
    
    public boolean isMatch(String s, String p) {
        return false;
    }

}
