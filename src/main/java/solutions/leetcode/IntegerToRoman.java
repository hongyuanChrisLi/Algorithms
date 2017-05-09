package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.IntegerToRomanTestCases;

/*
 * 

https://leetcode.com/problems/integer-to-roman/#/description
Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.

 * 
 * */

public class IntegerToRoman extends Solution<Integer, String> {

    @Override
    protected String runTest(Integer input) {
        return intToRoman(input);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }
    
    public String intToRoman(int num) {
        String[] baseRoman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] baseInt = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000, 4000};
        //int baseLen = 13;
        int sig = 0;
        String res = "";
        
        while (num >= baseInt[sig]) sig++;

        //System.out.println(baseInt[sig]);
        
        for ( int i = sig - 1; i >= 0; i-- ){
            int fract = num / baseInt[i];
            while(fract-- > 0) res += baseRoman[i];
            num = num  % baseInt[i];
        }
        return res;
    }

    @Override
    protected TestCases<Integer, String> genTestCases() {
        return new IntegerToRomanTestCases();
    }
}
