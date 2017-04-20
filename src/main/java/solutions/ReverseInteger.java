package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;


/*
 * 
https://leetcode.com/problems/reverse-integer/#/description

Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 * 
 * */

public class ReverseInteger extends Solution<Integer, Integer> {

    @Override
    protected Integer runTest(Integer input) {
        return this.reverse(input.intValue());
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int reverse(int x) {
        
        int res = 0;
        int maxResBound = 214748364;
        
        
        while (x != 0){
            
            if ((res >= maxResBound) || (res <= -maxResBound)){
                int attempt = res * 10 + x;
                if (attempt / 10 != res)
                    return 0; 
            }
                    
            res = res * 10 + x % 10;
            x = x / 10;      
        }
        return res;
    }

    
/*public int reverse(int x) {
        
        int res = 0;
        int maxResBound = 214748364;
        
        
        while (x != 0){
            
            if ( (res > maxResBound) 
                    || (res < -maxResBound) 
                    || (res == maxResBound && x > 7) 
                    || (res == -maxResBound && x < -8) )
                return 0;      
            
            res = res * 10 + x % 10;
            x = x / 10;      
        }
        return res;
    }*/
    
}
