package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.ImplStrStrTestCases;

/*
 * 

https://leetcode.com/problems/implement-strstr/#/description

Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 * 
 * */

public class ImplStrStr extends Solution<TwoComposite<String, String>, Integer> {

    @Override
    protected Integer runTest(TwoComposite<String, String> input) {
        return this.strStr(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
        
    }

    @Override
    protected TestCases<TwoComposite<String, String>, Integer> genTestCases() {
        return new ImplStrStrTestCases();
    }
    
    public int strStr(String haystack, String needle) {
        
        int nLen = needle.length();
        if (nLen == 0) return 0;
        int hLen = haystack.length() - nLen + 1;
        
        for ( int i = 0; i < hLen; i ++ ){
            boolean preFlag = haystack.charAt(i) == needle.charAt(0) 
                    && haystack.charAt(i + nLen - 1) == needle.charAt(nLen-1);
            if (preFlag && haystack.substring(i, i+nLen).equals(needle))
                return i;
        }
        
        return -1;
    }
}
