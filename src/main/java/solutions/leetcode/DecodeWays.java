package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

/*
 * 
https://leetcode.com/problems/decode-ways/#/description

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.

 * 
 * */

public class DecodeWays extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.numDecodings(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int numDecodings(String s) {
        
        int strLen = s.length();
        if (strLen == 0 || s.charAt(0) == '0') return 0;
        int[] ref = new int[strLen + 1];
        ref[0] = 1;
        ref[1] = 1;
        char preVal = s.charAt(0);
                
        for ( int i = 2; i <= strLen; i++ ){
            char curVal = s.charAt(i-1);
            if ( curVal == '0') {
                if (preVal == '1' || preVal == '2')         // case "...10" or "...20"
                    if ( ref[i-1] > ref[i-2])               // case "...210", "..220"...
                        ref[i] = ref[i-2];
                    else                                    // case "...420" ...
                        ref[i] = ref[i-1];
                else return 0;                              // case "...30" ...
            } else {
                if (preVal == '1' || ( preVal == '2' && curVal < '7'))
                    ref[i] = ref[i-1] + ref[i-2];           // case "...18", "...24" ...    
                else
                    ref[i] = ref[i-1];                      // case "...61", "...29" ...
            }
            preVal = curVal;
        }
        return ref[strLen];
    }

}
