package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.DivideTwoIntTestCases;

/*
 * 
https://leetcode.com/problems/divide-two-integers/#/description
Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.

https://discuss.leetcode.com/topic/15568/detailed-explained-8ms-c-solution

 * 
 * */

public class DivideTwoInt extends Solution<TwoComposite<Integer, Integer>, Integer> {

    @Override
    protected Integer runTest(TwoComposite<Integer, Integer> input) {
        return this.divide(input.var1, input.var2);
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
    protected TestCases<TwoComposite<Integer, Integer>, Integer> genTestCases() {
        return new DivideTwoIntTestCases();
    }
    
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        boolean sign = (dividend < 0) ^ (divisor < 0);
        int q = 0;
        long dvd = Math.abs((long)dividend);
        long div = Math.abs((long)divisor);
         
        while (dvd >= div){
            long inter = div;
            int mul = 1;
            while (dvd >= (inter << 1)){
                inter <<= 1;
                mul <<= 1;
                
            }
            //System.out.println(inter);
            dvd -= inter;
            q += mul;
        }
        return sign? -q : q;
    }
}
