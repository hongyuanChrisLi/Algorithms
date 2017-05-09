package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.RomanToIntegerTestCases;

/*
 * 
 https://leetcode.com/problems/roman-to-integer/#/description
 
 * */

public class RomanToInteger extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.romanToInt(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int romanToInt(String s) {   
        
        int strLen = s.length();
        if (strLen < 1) return 0;
        /*
         * 
         Char   I   V   X   L   C   D   M
         ASCII  73  86  88  76  67  68  77
         -'B'   6   19  21  9   0   1   10  // ASCII - 66
         Key    7   6   8   10  1   2   11  // %14
         
         * */
        int[] sCharMap = new int[]{0, 100, 500, 0, 0, 0, 5, 1, 10, 0, 50, 1000};
        int MVAL = 14;
        
        int res = sCharMap[(s.charAt(0) - 'B') % MVAL];
        int preVal = res;
        
        
        for (int i = 1; i < strLen; i++) {
            int curVal= sCharMap[(s.charAt(i) - 'B') % MVAL];
            res += curVal - (curVal > preVal ? preVal * 2 : 0);
            preVal = curVal;
        }
        return res;
    }

    @Override
    protected TestCases<String, Integer> genTestCases() {
        return new RomanToIntegerTestCases();
    }
    
}
