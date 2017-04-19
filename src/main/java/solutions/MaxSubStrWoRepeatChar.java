package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;

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
        
        return 0;
    }


}
