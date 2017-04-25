package testcases.dp;

import java.util.Arrays;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class KnapsackTestCases extends TestCases<TwoComposite<int[][], Integer>, List<Integer>>
        implements TwoCompositeTestCaseHandler<int[][], Integer, List<Integer>> {
    private static final long serialVersionUID = -6790378816584316161L;

    public KnapsackTestCases() {
        addTestCase("Test Example 1", 
                new int[][] { { 7, 9, 5, 12, 14, 6, 12 }, { 3, 4, 2, 6, 7, 3, 5 } }, 
                15,
                Arrays.asList(0, 1, 5, 6 ));
        addTestCase("Test 2", 
                new int[][] { { 4, 3, 8, 9, 2, 7 }, {2, 1, 3, 4, 1, 3} }, 
                10,
                Arrays.asList(0, 1, 2, 3 ));
    }

    @Override
    public boolean addTestCase(String name, int[][] input1, Integer input2, List<Integer> output) {
        return this.add(new TestCase<TwoComposite<int[][], Integer>, List<Integer>>(name,
                new TwoComposite<int[][], Integer>(input1, input2), output));
    }

}
