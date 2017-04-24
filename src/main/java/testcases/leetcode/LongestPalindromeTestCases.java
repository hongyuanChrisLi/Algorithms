package testcases.leetcode;

import base.TestCases;
import structures.TestCase;

public class LongestPalindromeTestCases extends TestCases<String, String[]> {

    private static final long serialVersionUID = 4496950699233944077L;
    
    public LongestPalindromeTestCases(){
        this.add(
                new TestCase<String, String[]>(
                        "Test Example 1",
                        "babad",
                        new String[]{"bab", "aba"}));
        this.add(
                new TestCase<String, String[]>(
                        "Test Example 2",
                        "cbbd",
                        new String[]{"bb"}));
        this.add(
                new TestCase<String, String[]>(
                        "Test No Palindrome",
                        "abcd",
                        new String[]{"a", "b", "c", "d"}));
        this.add(
                new TestCase<String, String[]>(
                        "Test Empty String",
                        "",
                        new String[]{""}));
        this.add(
                new TestCase<String, String[]>(
                        "Test One Character",
                        "x",
                        new String[]{"x"}));
    }

}
