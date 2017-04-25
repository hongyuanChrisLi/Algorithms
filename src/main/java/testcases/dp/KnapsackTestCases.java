package testcases.dp;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class KnapsackTestCases extends TestCases<TwoComposite<int[][], Integer>, int[]>
        implements TwoCompositeTestCaseHandler<int[][], Integer, int[]> {
    private static final long serialVersionUID = -6790378816584316161L;

    public KnapsackTestCases() {
        addTestCase("Test Example 1", new int[][] { { 7, 9, 5, 12, 14, 6, 12 }, { 3, 4, 2, 6, 7, 3, 5 } }, 15,
                new int[] { 0, 1, 5, 6 });
    }

    @Override
    public boolean addTestCase(String name, int[][] input1, Integer input2, int[] output) {
        return this.add(new TestCase<TwoComposite<int[][], Integer>, int[]>(name,
                new TwoComposite<int[][], Integer>(input1, input2), output));
    }

}
