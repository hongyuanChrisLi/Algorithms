package base;

import structures.TestCase;

public abstract class Solution<T_In, T_Out>{

    public void runTests(TestCases<T_In, T_Out> testCases){
        for ( TestCase<T_In, T_Out> testCase : testCases){
            String testName = this.getClass().getSimpleName() + " - " + testCase.getTestName();
            T_Out output = runTest(testCase.getInput());
            printOutput(testName, output);
            try{
                testOutput(testCase.getOutput(), output);
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
    
    private void printOutput(String testName, T_Out output){
        System.out.print("[OUTPUT] " + testName + ": ");
        printOutputData(output);
    };
    
    protected abstract T_Out runTest(T_In input);
    protected abstract void printOutputData(T_Out output);
    protected abstract void testOutput(T_Out outputTest, T_Out output);
}
