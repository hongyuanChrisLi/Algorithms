package solutions;

import structures.TestCase;
import testcases.TestCases;

public abstract class Solution<T_In, T_Out>{

    public void runTests(TestCases<T_In, T_Out> testCases){
        for ( TestCase<T_In, T_Out> testCase : testCases){
            String testName = this.getClass().getSimpleName() + " - " + testCase.getTestName();
            T_Out output = runTest(testCase.getInput());
            printOutput(output);
            try{
                testOutput(output, testCase.getOutput());
                testSuccess(testName);
            }catch(AssertionError e){
                testFailure(testName);
                System.out.println(e);
                System.exit(1);
            }
        }
    }
    
    private void testSuccess(String testName){
        System.out.println("[PASS] " + testName);
    }
    
    private void testFailure(String testName){
        System.out.println("[FAIL] " + testName);
    }
    
    protected abstract T_Out runTest(T_In input);
    protected abstract void printOutput(T_Out output);
    protected abstract void testOutput(T_Out output, T_Out outputTest);
}
