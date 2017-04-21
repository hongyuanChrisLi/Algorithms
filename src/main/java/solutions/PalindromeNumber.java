package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;

/*
 * 
https://leetcode.com/problems/palindrome-number/#/description
Determine whether an integer is a palindrome. Do this without extra space.

Negative numbers are not palindromes. 

Smart solution: 
    https://discuss.leetcode.com/topic/8090/9-line-accepted-java-code-without-the-need-of-handling-overflow

 * 
 * */

public class PalindromeNumber extends Solution<Integer, Boolean> {

    @Override
    protected Boolean runTest(Integer input) {
        return this.isPalindrome(input);
    }

    @Override
    protected void printOutputData(Boolean output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Boolean outputTest, Boolean output) {
        assertEquals(outputTest, output);
    }
    
    
    public boolean isPalindrome(int x) {
        
        if (x < 0 || ( x > 0 && x % 10 == 0))
            return false;
        
        int rev = 0;
        
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        
        System.out.printf("%d, %d\n", x, rev);
        
        return ( x == rev || x == rev / 10);
    }
    
    /*public boolean isPalindrome(int x) {
        
        int head, tail, headBase;
        
        if ( x < 0 )
            return false;
        
        int totDigits = (int) Math.floor(Math.log10(x/10)) + 1;
        // System.out.printf("%d, %d\n", x, totDigits);

        while ( totDigits > 0 ){
            
            headBase = (int) Math.pow(10, totDigits);
            
            head = x / headBase;
            tail = x % 10;
            
            //System.out.printf("%d, %d\n", head, tail);
            
            if ( head != tail )
                return false;
            
            x = x % headBase;
            x = x / 10;
            
            totDigits -= 2;
        }
        
        return true;
    }*/

}
