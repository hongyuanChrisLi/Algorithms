package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import base.Solution;
import structures.TwoComposite;

public class ThreeSumClosest extends Solution<TwoComposite<int[], Integer>, Integer> {

    @Override
    protected Integer runTest(TwoComposite<int[], Integer> input) {
        return this.threeSumClosest(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }

    public int threeSumClosest(int[] nums, int target) {
        return 0;
    }
}
