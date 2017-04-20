package testcases;

import base.TestCases;
import structures.TestCase;

public class ReverseIntegerTestCases extends TestCases<Integer, Integer> {
    private static final long serialVersionUID = 2043476215958248178L;

    public ReverseIntegerTestCases() {
        this.add(new TestCase<Integer, Integer>("Test Example 1", 123, 321));
        this.add(new TestCase<Integer, Integer>("Test Example 2", -123, -321));
        this.add(new TestCase<Integer, Integer>("Test Example Overflow", 1563847412, 0));
        this.add(new TestCase<Integer, Integer>("Test Neg Overflow", -2147483648, 0));
        this.add(new TestCase<Integer, Integer>("Test Neg Within Bound", -1463847412, -2147483641));
        this.add(new TestCase<Integer, Integer>("Test Pos Overflow", 2147483647, 0));
        this.add(new TestCase<Integer, Integer>("Test Pos Within Bound", 1463847412, 2147483641));
        this.add(new TestCase<Integer, Integer>("Test One Digit", 2, 2));
        this.add(new TestCase<Integer, Integer>("Test Two Digits", 34, 43));
    }

}
