package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

/*
 * 

Write a function to find the longest common prefix string amongst an array of strings.

https://leetcode.com/problems/longest-common-prefix/#/description
https://leetcode.com/articles/longest-common-prefix/

 * 
 * */

public class MaxCommonPrefix extends Solution<String[], String> {

    @Override
    protected String runTest(String[] input) {
        return this.longestCommonPrefix(input);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }

    public String longestCommonPrefix(String[] strs) {
        
        int strsLen = strs.length;
        if (strsLen < 1) return "";
        int minStrLen = Integer.MAX_VALUE;
        String maxCom = "";
        
        for (int i = 0; i < strsLen; i++ )
            minStrLen = Math.min(minStrLen, strs[i].length());
        
        for (int j = 0; j < minStrLen; j++ ) {
            char curChar = strs[0].charAt(j); 
            for (int i = 1; i < strsLen; i++ ) {
                if ( curChar != strs[i].charAt(j)) return maxCom;
            }
            maxCom += curChar;
        }
        return maxCom;
    }
}
