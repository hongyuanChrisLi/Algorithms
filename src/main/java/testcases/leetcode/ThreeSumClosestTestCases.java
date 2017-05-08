package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class ThreeSumClosestTestCases extends TestCases<TwoComposite<int[], Integer>, Integer>
        implements TwoCompositeTestCaseHandler<int[], Integer, Integer> {

    private static final long serialVersionUID = 2087865277982475994L;

    public ThreeSumClosestTestCases(){
        addTestCase("Test Example", new int[]{-1, 2, 1, -4}, 1, 2);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, Integer output) {
        return this.add(new TestCase<TwoComposite<int[], Integer>, Integer>(
                name, 
                new TwoComposite<int[], Integer>(input1, input2), 
                output));
    }

}
