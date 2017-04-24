package structures;

public interface TwoCompositeTestCaseHandler<T1, T2, T3> {
    
    public boolean addTestCase (String name, T1 input1, T2 input2, T3 output);
}
