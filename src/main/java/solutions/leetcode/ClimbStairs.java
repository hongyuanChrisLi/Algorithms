package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.ClimbStairsTestCases;

/*
 * 
https://leetcode.com/submissions/detail/101366508/

Fibonacci numbers at its core

You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.

 * 
 * */

public class ClimbStairs extends Solution<Integer, Integer> {

    @Override
    protected Integer runTest(Integer input) {
        return this.climbStairs(input);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int climbStairs(int n) {
        
        if ( n < 1 ) return 1;
        
        int[] refTab = new int[n + 1];
        refTab[0] = 1;
        refTab[1] = 1;
        
        for ( int i = 2; i <= n; i ++ ) {
            refTab[i] = refTab[i-2] + refTab[i-1];
        }
        return refTab[n];
    }

    @Override
    protected TestCases<Integer, Integer> genTestCases() {
        return new ClimbStairsTestCases();
    }
}
