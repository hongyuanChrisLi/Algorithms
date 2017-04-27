package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

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
}
