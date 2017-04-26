package solutions.dp;

public class ChainMatricesTopDwn extends ChainMatricesBtmUp {

    @Override
    protected void buildRefTabs() {
        cmtd(1, pLen - 1);
    }
    
    private int cmtd(int m, int n){
        
        if (m >= n) return 0;
        if (refCost[m][n] != 0) return refCost[m][n];
        
        refCost[m][n] = Integer.MAX_VALUE;
        
        for ( int k = m; k < n; k++ ) {
            int res = cmtd(m, k) + cmtd(k+1, n) + p[m-1] * p[k] * p[n];
            if (res < refCost[m][n]) {
                refCost[m][n] = res;
                refSeq[m][n] = k;
            }
        }
        
        return refCost[m][n];
    }
}
