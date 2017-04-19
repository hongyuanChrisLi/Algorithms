package testcases;

import base.TestCases;
import structures.TestCase;

public class MaxSubStrWoRepeatCharTestCases extends TestCases<String, Integer> {

    private static final long serialVersionUID = -8084291561690302936L;

    public MaxSubStrWoRepeatCharTestCases() {
        this.add(new TestCase<String, Integer>("Test Example 1", "abcabcbb", 3));
        this.add(new TestCase<String, Integer>("Test Example 2", "bbbbb", 1));
        this.add(new TestCase<String, Integer>("Test Example 3", "pwwkew", 3));
    }

}
