package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import testcases.leetcode.UniqueBinarySearchTreeTestCases;

/*
 * 

https://leetcode.com/problems/unique-binary-search-trees/#/description

Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

 * 
 * */

public class UniqueBinarySearchTree extends Solution<Integer, Integer> {

    @Override
    protected Integer runTest(Integer input) {
        return numTrees(input);
    }

    @Override
    protected void printOutputData(Integer output) {
       System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int numTrees(int n) {
        
        if ( n < 2 ) return 1;
        
        int[] ref = new int[n+1];
        
        ref[0] = 1;
        ref[1] = 1;

        for (int i = 2; i <= n; i++)
            for (int j = 0; j < i; j++ ) {
                ref[i] += ref[j] * ref[i-j-1]; 
            }

        return ref[n];
    }

    @Override
    protected TestCases<Integer, Integer> genTestCases() {
        return new UniqueBinarySearchTreeTestCases();
    }
    
}
