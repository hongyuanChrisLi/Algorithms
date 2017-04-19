package testcases;

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
    }

}
