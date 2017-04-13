package structures;

public class TestCase<T1, T2> {
    private String testName;
    private T1 input;
    private T2 output;
    
    public TestCase(String testName, T1 input, T2 output){
        this.testName = testName;
        this.input = input;
        this.output = output;
    }
    
    public T1 getInput(){
        return this.input; 
    }
    
    public T2 getOutput(){
        return this.output;
    }

    public String getTestName() {
        return testName;
    }

}
