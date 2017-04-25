package solutions.dp;

public class KnapsackTopDwn extends KnapsackBtmUp {

    @Override
    protected void init(int[][] items, int limit){
        super.init(items, limit);
        
        for (int i = 0; i <= itemNum; i++) 
            for (int j = 0; j <= limit; j++)
                refTab[i][j] = -1;
    }
    
    @Override
    protected void buildRefTab(){
        knapsack(itemNum, limit);
    }
    
    private int knapsack(int m, int n){
        
        if (m == 0 || n < items[1][m-1]) return 0;
   
        if (refTab[m][n] != -1) return refTab[m][n];
        else {
            refTab[m][n] = 
                Math.max(
                    knapsack(m-1,n-items[1][m-1]) + items[0][m-1],
                    Math.max(
                            knapsack(m-1, n), 
                            knapsack(m,n-items[1][m-1])));
        }
        return refTab[m][n];
    }
}
