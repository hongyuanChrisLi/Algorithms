package base;

import structures.TestCase;

public abstract class Solution<T_In, T_Out>{

    public void runTests(TestCases<T_In, T_Out> testCases){
        for ( TestCase<T_In, T_Out> testCase : testCases){
            String testName = this.getClass().getSimpleName() + " - " + testCase.getTestName();
            T_Out output = runTest(testCase.getInput());
            try{
                testOutput(testCase.getOutput(), output);
                testSuccess(testName, output);
            }catch(AssertionError e){
                testFailure(testName, output);
                System.out.println(e);
                System.exit(1);
            }
        }
    }
    
    private void testSuccess(String testName, T_Out output){
        System.out.println("[PASS] " + testName);
        printOutput(output);
    }
    
    private void testFailure(String testName, T_Out output){
        System.out.println("[FAIL] " + testName);
        printOutput(output);
    }
    
    private void printOutput(T_Out output){
        System.out.print("\t[OUTPUT]: ");
        printOutputData(output);
        System.out.println("");
    };
    
    protected abstract T_Out runTest(T_In input);
    protected abstract void printOutputData(T_Out output);
    protected abstract void testOutput(T_Out outputTest, T_Out output);
}
