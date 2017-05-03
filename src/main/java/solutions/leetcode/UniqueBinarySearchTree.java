package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;

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
        
        return 0;
    }
    
}
