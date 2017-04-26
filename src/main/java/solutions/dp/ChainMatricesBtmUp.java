package solutions.dp;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.Solution;

/*
 * 
 * 
/src/main/resources/lect001 Example 3
/src/main/resources/L12

Definition 11.3 The Matrix Product Parenthesization problem is as follows. Suppose we
need to multiply a series of matrices: A1 × A2 × A3 × . . . × An. Given the dimensions of these
matrices, what is the best way to parenthesize them, assuming for simplicity that standard matrix
multiplication is to be used (e.g., not Strassen)?

 * 
 * */

public class ChainMatricesBtmUp extends Solution<int[], List<List<Integer>>> {

    @Override
    protected List<List<Integer>> runTest(int[] input) {
        init(input);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(this.findSeq());
        return res;
    }

    @Override
    protected void printOutputData(List<List<Integer>> output) {
        System.out.println(output.get(0));
    }

    @Override
    protected void testOutput(List<List<Integer>> outputTest, List<List<Integer>> output) {
        assertTrue(outputTest.contains(output.get(0)));
    }

    int[] p; // matrix dimensions
    int pLen;
    int[][] refCost; // matrix product cost
    int[][] refSeq; // matrix product sequence

    private void init(int[] p) {
        this.p = p;
        pLen = p.length;
        refCost = new int[pLen][pLen];
        refSeq = new int[pLen][pLen];

        /*for (int i = 0; i < pLen; i++)
            for (int j = 0; j < pLen; j++)
                refCost[i][j] = -1;*/
    }
    
    
    public List<Integer> findSeq() {
        buildRefTabs();
        
/*        for (int i = 0; i < pLen; i++)
            System.out.println(Arrays.toString(refCost[i]));
        
        System.out.println("");
        
        for (int i = 0; i < pLen; i++)
            System.out.println(Arrays.toString(refSeq[i]));*/
        
        return traceBack(1, pLen-1);

    }

    protected void buildRefTabs(){
        for (int i = pLen - 1; i > 0; i--)
            for (int j = i + 1; j < pLen; j++) {
                refCost[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = refCost[i][k] + refCost[k + 1][j] 
                                + p[i - 1] * p[k] * p[j];
                    if (cost < refCost[i][j]) {
                        refCost[i][j] = cost;
                        refSeq[i][j] = k; 
                    }
                }
            }
    }
    
    protected List<Integer> traceBack(int start, int end){
        
        List<Integer> res = new ArrayList<Integer>();
        //System.out.printf("%d, %d\n", start, end);
        if ( start < end ) {
            int mid = refSeq[start][end];
            //System.out.println(mid);
            
            if (end - mid > 1 || mid > start)
                res.add(mid);
            res.addAll(traceBack(start, mid));
            res.addAll(traceBack(mid + 1, end));
        }

        return res;
    }

}
