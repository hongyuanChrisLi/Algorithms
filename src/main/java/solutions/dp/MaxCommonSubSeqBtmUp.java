package solutions.dp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import base.Solution;
import structures.TwoComposite;

/*
 *
/src/main/resources/lect001 Example 1 

We are given two strings: string S of length n, and string T of length m. 
Our goal is to produce their longest common subsequence: 
the longest sequence of characters that appear left-to-right 
(but not necessarily in a contiguous block) in both strings.

For example, consider:
S = ABAZDC
T = BACBAD

In this case, the LCS has length 4 and is the string ABAD.

 * 
 * */

public class MaxCommonSubSeqBtmUp extends Solution<TwoComposite<String, String>, String> {

    @Override
    protected String runTest(TwoComposite<String, String> input) {
        return this.findSeq(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }

    protected String strA;
    protected String strB;
    protected int strALen;
    protected int strBLen;
    protected int[][] refTab;
    
    public String findSeq(String strA, String strB) {
        init(strA, strB);
        lcs(strALen, strBLen);

        /*for (int i = 0; i < strALen; i++)
            System.out.println(Arrays.toString(refTab[i + 1]));*/
        return traceBack();
    }

    protected void init(String strA, String strB){
        this.strA = strA;
        this.strB = strB;
        this.strALen = strA.length();
        this.strBLen = strB.length();
        this.refTab = new int[strALen + 1][strBLen + 1];
    }
    
    protected int lcs(int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (this.strA.charAt(i) == this.strB.charAt(j))
                    this.refTab[i + 1][j + 1] = this.refTab[i][j] + 1;
                else
                    this.refTab[i + 1][j + 1] = Math.max(this.refTab[i][j + 1], this.refTab[i + 1][j]);
            }
        }
        return this.refTab[m][n];
    }
    
    private String traceBack(){
        
        String res = "";

        for (int i = strALen, j = strBLen; i > 0 && j > 0;) {

            //System.out.printf("%d, %d, %s\n", i, j, res);

            if (refTab[i][j] == refTab[i - 1][j])
                i -= 1;
            else if (refTab[i][j] == refTab[i][j - 1])
                j -= 1;
            else {
                res = strA.substring(i - 1, i) + res;
                i -= 1;
                j -= 1;
            }
        }
        
        return res;
    }
    
}
