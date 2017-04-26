package testcases.dp;

import java.util.ArrayList;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class ChainMatricesTestCases extends TestCases<int[], List<List<Integer>>> 
implements TestCaseHandler<int[], int[][]> {
    
    private static final long serialVersionUID = 5249518868526625328L;
    
    public ChainMatricesTestCases(){
        addTestCase("Test 1", 
                new int[]{5, 4, 6, 2, 7, 3}, 
                new int[][]{{3, 1}});
        
        addTestCase("Test 2", 
                new int[]{2, 8, 9, 8, 10, 2, 3}, 
                new int[][]{{5, 1, 2, 3}});
        
        addTestCase("Test 3", 
                new int[]{2, 8, 3, 8, 4, 2, 3}, 
                new int[][]{{5, 2, 3}});
        
        addTestCase("Test 4 All ones", 
                new int[]{1, 1, 1, 1, 1}, 
                new int[][]{{1,2}, {3,2}});
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, int[][]output) {
        List<List<Integer>> caseLst = new ArrayList<List<Integer>>();

        int caseNum = output.length;
        for (int i = 0; i < caseNum; i ++ ){
            int seqNum = output[i].length;
            List<Integer> outLst = new ArrayList<Integer>();
            for (int j = 0; j < seqNum; j++) {
                outLst.add(output[i][j]);
            }
            caseLst.add(outLst);
        }
        
        return this.add(new TestCase<int[], List<List<Integer>>>(name, input, caseLst));
    }

}
