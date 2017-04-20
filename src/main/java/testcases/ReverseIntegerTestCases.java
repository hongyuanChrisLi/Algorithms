package testcases;

import base.TestCases;
import structures.TestCase;

public class ReverseIntegerTestCases extends TestCases<Integer, Integer> {
    private static final long serialVersionUID = 2043476215958248178L;

    public ReverseIntegerTestCases() {
        this.add(new TestCase<Integer, Integer>("Test Example 1", 123, 321));
        this.add(new TestCase<Integer, Integer>("Test Example 2", -123, -321));
    }

}
