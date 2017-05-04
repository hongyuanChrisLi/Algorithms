package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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
        
        s = s + (char) 2;
        p = p + (char) 2;
        
        int sLen = s.length();
        int pLen = p.length();
        int dLen = 1;
        p = p + (char) 0;

        boolean[][] refTab = new boolean[pLen + 1][sLen + 1];
        refTab[0][0] = true;
        
        int pIdx = 0;
        
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
                refTab[dLen][j+1] = (isStarChar 
                                        && (refTab[dLen - 1][j+1] 
                                                || (isMatch && refTab[dLen][j]))) 
                                    || (isMatch && refTab[dLen-1][j]);
            }
            dLen += 1;
        }
        
        /*for (int i = 0; i < dLen; i++)
            System.out.println(Arrays.toString(refTab[i]));*/
  
        return refTab[dLen-1][sLen];  
    }

}
