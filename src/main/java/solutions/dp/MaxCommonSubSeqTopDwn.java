package solutions.dp;

import java.util.Arrays;

public class MaxCommonSubSeqTopDwn extends MaxCommonSubSeqBtmUp {
    
    @Override
    protected void init(String strA, String strB){
        super.init(strA, strB);
        // Arrays.fill(this.refTab, -1);
        
        for (int i = 0; i <= strALen; i++)
            for (int j = 0; j <= strBLen; j++)
                refTab[i][j] = -1;
    }
    
    @Override
    protected int lcs(int m, int n){
        
        if (m == 0 || n == 0) return 0;
        if (refTab[m][n] != -1) return this.refTab[m][n];
        else if (strA.charAt(m-1) == strB.charAt(n-1)){
            refTab[m][n] = lcs(m-1, n-1) + 1;
        }else{
            refTab[m][n] = Math.max(lcs(m-1, n), lcs(m, n-1));
        }
        return refTab[m][n];
    }           
}
