package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import base.Solution;
import base.TestCases;
import testcases.leetcode.MaxSubStrWoRepeatCharTestCases;

/*
 * 
https://leetcode.com/problems/longest-substring-without-repeating-characters/#/description

Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. 
Note that the answer must be a substring, "pwke" is a subsequence and not a substring. 
 * 
 * */


public class MaxSubStrWoRepeatChar extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.lengthOfLongestSubstring(input);
    }

    @Override
    protected void printOutputData(Integer output) {
       System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
       assertEquals(outputTest, output);
    }
    
    public int lengthOfLongestSubstring(String s) {
        
        int strLen = s.length();
        
        if (strLen == 0)
            return 0;
        
        int baseAscii = (int) ' ';
        
        int[] subStrMap = new int[100]; 
        int start = 1, maxLen = 0;
        
        for (int i = 1; i <= strLen; i++) {
            
            int charIdx = (int) s.charAt(i-1) - baseAscii;
            int strIdx = subStrMap[charIdx];
            if (strIdx != 0 && strIdx >= start) 
                start = strIdx + 1;
            
            if ( i - start + 1 > maxLen)
                maxLen = i - start + 1;
            
            subStrMap[charIdx] = i;
        }
        return maxLen;  
    }

    @Override
    protected TestCases<String, Integer> genTestCases() {
        return new MaxSubStrWoRepeatCharTestCases();
    }
    
    
    
/*    public int lengthOfLongestSubstring(String s) {
        
        int strLen = s.length();
        
        if (strLen == 0)
            return 0;
        
        Map<Character, Integer> subStrMap = new HashMap<Character, Integer>();
        int start = 0, maxLen = 0;
        
        for (int i = 0; i < strLen; i++) { 
            
            Character charVal = new Character (s.charAt(i));
            
            if (subStrMap.containsKey(charVal)) {
                int idx = subStrMap.get(charVal);
                if (idx >= start) 
                    start = idx + 1;
            } 
            
            if ( i - start + 1 > maxLen)
                maxLen = i - start + 1;
            
            subStrMap.put(charVal, i);
        }
        return maxLen;
    }*/
}
