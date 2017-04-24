package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class TwoSumTestCases extends TestCases<TwoComposite<int[], Integer>, int[]>
implements TwoCompositeTestCaseHandler<int[], Integer, int[]>{

    private static final long serialVersionUID = -8849655972755570264L;

    public TwoSumTestCases() {
        addTestCase("Test 1", new int[] { 2, 7, 11, 15 }, 9, new int[] { 0, 1 });
    }

    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, int[] output) {
        return  this.add(
                new TestCase<TwoComposite<int[], Integer>, int[]>(
                        name,
                        new TwoComposite<int[], Integer>(input1, input2), 
                        output));
    }

}
