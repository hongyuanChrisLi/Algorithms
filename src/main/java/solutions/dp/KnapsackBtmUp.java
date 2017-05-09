package solutions.dp;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.dp.KnapsackTestCases;

/*
 * 
/src/main/resources/lect001 Example 2

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

public class KnapsackBtmUp extends Solution<TwoComposite<int[][], Integer>, List<Integer>> {

    @Override
    protected List<Integer> runTest(TwoComposite<int[][], Integer> input) {
        init(input.var1, input.var2);
        return this.findOptimal();
    }
    
    @Override
    protected void printOutputData(List<Integer> output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(List<Integer> outputTest, List<Integer> output) {
        assertEquals(outputTest, output);
    }
    
    protected int[][] items;
    protected int limit;
    protected int itemNum;
    protected int[][] refTab;
    
    protected void init(int[][] items, int limit){
        this.items = items;
        this.limit = limit;
        this.itemNum = items[0].length;
        this.refTab = new int[itemNum + 1][limit + 1];
    }
    
    public List<Integer> findOptimal(){
        buildRefTab();
        
        /*for (int i = 0; i < itemNum; i++)
            System.out.println(Arrays.toString(refTab[i + 1]));*/
        
        return traceBack();
    }
    
    protected void buildRefTab(){
        for (int i = 0; i < itemNum; i ++){
            for (int j = 1; j <= limit; j ++ ){
                if ( items[1][i] > j) 
                    refTab[i+1][j] = refTab[i][j];
                else 
                    refTab[i+1][j] = 
                    Math.max(
                            refTab[i][j - items[1][i]] + items[0][i], 
                            Math.max(
                                    refTab[i][j],
                                    refTab[i+1][j-1]));
            }
        }
    }
    
    private List<Integer> traceBack(){
        
        List<Integer> res = new ArrayList<Integer>();
        
        for (int i = itemNum, j = limit; i > 0 && j >= items[1][i-1]; ) {
            if ( refTab[i][j] == refTab[i-1][j])
                i -= 1;
            else if ( refTab[i][j] == refTab[i][j - items[1][i-1]])
                j -= items[1][i-1];
            else {
                res.add(0, i-1);
                j -= items[1][i-1];
                i -= 1;
            }
        }
        
        return res;
    }

    @Override
    protected TestCases<TwoComposite<int[][], Integer>, List<Integer>> genTestCases() {
        return new KnapsackTestCases();
    }
}
