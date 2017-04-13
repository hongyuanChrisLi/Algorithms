package structures;

public class TestCase<T1, T2> {
    private T1 input;
    private T2 output;
    
    public TestCase(T1 input, T2 output){
        this.input = input;
        this.output = output;
    }
    
    public T1 getInput(){
        return this.input; 
    }
    
    public T2 getOutput(){
        return this.output;
    }
}
