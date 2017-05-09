package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.StringToIntegerTestCases;

/*
 *
https://leetcode.com/problems/string-to-integer-atoi/#/description

Implement atoi to convert a string to an integer.

Requirements for atoi:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. 
Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, 
which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, 
or if no such sequence exists because either str is empty or it contains only whitespace characters, 
no conversion is performed.

If no valid conversion could be performed, a zero value is returned. 
If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * 
 * */

public class StringToInteger extends Solution<String, Integer> {

    @Override
    protected Integer runTest(String input) {
        return this.myAtoi(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int myAtoi(String str) {
        
        int strLen = str.length();
        
        int maxResBound = 214748364;
        int INT_MAX = 2147483647;
        int INT_MIN = -2147483648;
        
        int sign = 0, num = 0, res = 0, idx = 0;
        boolean isNum = false;
        
        while (idx < strLen) {
                                        // Process chars before number
            char curChar = str.charAt(idx);
            
            if ( curChar == ' '){       // Leading spaces => Do nothing
                if (sign != 0)          // space after sign. Invalid;
                    break;
            }
            else if ( curChar == '+' || curChar == '-') {
                if (sign == 0)          // Convert + or - chars to 1 or -1
                    sign = 44 - curChar;
                else                    // More than 1 sign. Invalid.
                    break;    
            }else if (curChar >= '0' && curChar <= '9') {
                isNum = true;           // This is a number
                if (sign == 0)          // No sign, then positive
                    sign = 1;
                break;
            }else                       
                break;                  // Other leading characters. Invalid
            idx ++;
        }
        
        while ( isNum && idx < strLen) {
                                        // Process the number
            char curChar = str.charAt(idx);
            
           //System.out.println(curChar);  
            
            if (curChar >= '0' && curChar <= '9') {      
                res = num * sign;
                if (( res >= maxResBound) || (res <= -maxResBound)){
                                        // Overflow detection
                    int attempt = res * 10 + (int)(curChar - '0') * sign;
                    if (attempt / 10 != res)
                        return sign < 0? INT_MIN : INT_MAX; 
                }
                num = num * 10 + (int)(curChar - '0');
            } else
                isNum = false;          // Other characters. End of the number
            idx ++;     
        }
        
        return num * sign;
    }

    @Override
    protected TestCases<String, Integer> genTestCases() {
        return new StringToIntegerTestCases();
    }

}
