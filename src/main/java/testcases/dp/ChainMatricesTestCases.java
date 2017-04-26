package testcases.dp;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class ChainMatricesTestCases extends TestCases<int[], int[]> implements TestCaseHandler<int[], int[]> {
    
    private static final long serialVersionUID = 5249518868526625328L;
    
    public ChainMatricesTestCases(){
        addTestCase("Test 1", 
                new int[]{5, 4, 6, 2, 7, 3}, 
                new int[]{3, 2});
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, int[] output) {
        return this.add(new TestCase<int[], int[]>(name, input, output ));
    }

}
