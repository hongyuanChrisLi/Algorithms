package testcases.leetcode;

import base.TestCases;
import structures.IntArrayInt;
import structures.TestCase;

public class TwoSumTestCases extends TestCases<IntArrayInt, int[]> {

    private static final long serialVersionUID = -8849655972755570264L;

    public TwoSumTestCases() {
        this.add(
                new TestCase<IntArrayInt, int[]>(
                        "Test 1",
                        new IntArrayInt(new int[] { 2, 7, 11, 15 }, 9), 
                        new int[] { 0, 1 }));
    }

}
