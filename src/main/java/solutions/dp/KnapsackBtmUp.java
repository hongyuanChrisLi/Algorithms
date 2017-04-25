package solutions.dp;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import base.Solution;
import structures.TwoComposite;

/*
 * 

Definition 11.2 In the knapsack problem we are given a set of n items, 
    where each item i is specified by a size si and a value vi. 
We are also given a size bound S (the size of our knapsack).
The goal is to find the subset of items of maximum total value 
    such that sum of their sizes is at most S (they all fit into the knapsack).

For example, say the values and
times for our assignment are:
        A   B   C   D   E   F   G
value   7   9   5   12  14  6   12
time    3   4   2   6   7   3   5
Say you have a total of 15 hours: which parts should you do?

 * 
 * */

public class KnapsackBtmUp extends Solution<TwoComposite<int[][], Integer>, int[]> {

    @Override
    protected int[] runTest(TwoComposite<int[][], Integer> input) {
        return this.findOptimal(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(int[] output) {
        System.out.println(Arrays.toString(output));
    }

    @Override
    protected void testOutput(int[] outputTest, int[] output) {
        assertArrayEquals(outputTest, output);
    }
    
    public int[] findOptimal(int[][] items, int limit){
        return null;
    }
}
