package solutions;

import structures.TestCase;
import testcases.TestCases;

public abstract class Solution<T_In, T_Out>{

    public void runTests(TestCases<T_In, T_Out> testCases){
        for ( TestCase<T_In, T_Out> testCase : testCases){
            T_Out output = runTest(testCase.getInput());
            assert output == testCase.getOutput();
        }
    }
    
    protected abstract T_Out runTest(T_In input);
    
}
