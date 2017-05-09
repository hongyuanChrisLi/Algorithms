package solutions.leetcode;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import base.Solution;
import base.TestCases;
import testcases.leetcode.LongestPalindromeTestCases;

/*
 * 
https://leetcode.com/problems/longest-palindromic-substring/#/description

Given a string s, find the longest palindromic substring in s. 
You may assume that the maximum length of s is 1000.

Example:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example:
Input: "cbbd"
Output: "bb"

Solution Reference: 
    https://difusal.blogspot.com/2014/08/manachers-algorithm-longest-palindromic.html

 * 
 * */

public class LongestPalindrome extends Solution<String, String[]> {

    @Override
    protected String[] runTest(String input) {
        return new String[] { this.longestPalindrome(input) };
    }

    @Override
    protected void printOutputData(String[] output) {
        System.out.println(output[0]);
    }

    @Override
    protected void testOutput(String[] outputTest, String[] output) {
        assertTrue(Arrays.asList(outputTest).contains(output[0]));
    }

    public String longestPalindrome(String s) {

        int strLen = s.length();

        if (strLen == 0)
            return "";

        int arrayLen = 2 * strLen + 1;
        char[] charArray = new char[arrayLen];
        for (int i = 0; i < arrayLen; i++) {
            if (i % 2 == 0) {
                charArray[i] = '#';
            } else {
                charArray[i] = s.charAt((i - 1) / 2);
            }
        }

        int centerIdx = 0;
        int maxSubPalinLen = 0;

        for (int i = 0; i < arrayLen; i++) {
            int sideLen = Math.min(i - 0, arrayLen - i - 1);
            int subPalinLen = 1;

            for (int j = 1; j <= sideLen; j++) {
                if (charArray[i - j] != charArray[i + j])
                    break;
                subPalinLen += 2;
            }

            if (subPalinLen > maxSubPalinLen) {
                maxSubPalinLen = subPalinLen;
                centerIdx = i;
            }
        }

        return String.copyValueOf(Arrays.copyOfRange(charArray, centerIdx - (maxSubPalinLen - 1) / 2,
                centerIdx + (maxSubPalinLen - 1) / 2)).replaceAll("#", "");
    }

    @Override
    protected TestCases<String, String[]> genTestCases() {
        return new LongestPalindromeTestCases();
    }

}
