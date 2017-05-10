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
        return 0;
    }

}
