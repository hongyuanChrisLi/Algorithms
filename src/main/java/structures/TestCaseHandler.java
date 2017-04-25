package structures;

public interface TestCaseHandler<T_in, T_out> {
    public boolean addTestCase(String name, T_in input, T_out output);
}
