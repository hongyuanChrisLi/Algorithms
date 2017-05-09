package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.RegexMatchTestCases;

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
        
        s = s + (char) 2;
        p = p + (char) 2;
        
        int sLen = s.length();
        int pLen = p.length();
        int dLen = 1; // mark number of pattern units (e.g. a, a*, ., .*)
        p = p + (char) 0;

        boolean[][] refTab = new boolean[pLen + 1][sLen + 1];
        refTab[0][0] = true;
        
        int pIdx = 0; // index to loop through patter String p
        
        while (pIdx < pLen) {
            char curChar = p.charAt(pIdx);
            char nextChar = p.charAt(pIdx + 1);
            boolean isStarChar = curChar != '*' && nextChar == '*';
            
            if (isStarChar){
                pIdx += 2;
                refTab[dLen][0] = refTab[dLen-1][0];
            } else pIdx += 1;

            for (int j = 0; j < sLen; j++ ) {
                boolean isMatch = s.charAt(j) == curChar || curChar == '.';
                boolean isStarMatch = isMatch && isStarChar;
                refTab[dLen][j+1] = isMatch && refTab[dLen - 1][j]  // 1. direct match at [i][j] and [i-1][j-1] is a match
                        || isStarMatch && refTab[dLen][j]           // 2. direct match at [i][j], but [i-1][j-1] is NOT a match. 
                                                                    //      Since it's a star match, check if [i][j-1] is a match
                        || isStarChar && refTab[dLen - 1][j + 1];   // 3. NOT direct match [i][j], but it's a star char (e.g. a*)
                                                                    //      check if [i-1][j] is a match, meaning skip [i][j]
            }
            dLen += 1;
        }
        
        /*for (int i = 0; i < dLen; i++)
            System.out.println(Arrays.toString(refTab[i]));*/
  
        return refTab[dLen-1][sLen];  
    }

    @Override
    protected TestCases<TwoComposite<String, String>, Boolean> genTestCases() {
        return new RegexMatchTestCases();
    }

}
