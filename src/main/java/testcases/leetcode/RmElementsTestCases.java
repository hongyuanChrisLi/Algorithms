package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class RmElementsTestCases extends TestCases<TwoComposite<int[], Integer>, Integer>
        implements TwoCompositeTestCaseHandler<int[], Integer, Integer> {

    private static final long serialVersionUID = 7134948302801450905L;

    public RmElementsTestCases(){
        addTestCase("Test Example", new int[]{3,2,2,3}, 3, 2);
        addTestCase("Test 2", new int[]{2,2,2}, 2, 0);
        addTestCase("Test 3", new int[]{}, 4, 0);
        addTestCase("Test 4", new int[]{1,4,5,2,1,1,1}, 1, 3);
    }
    
    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, Integer output) {
        return this.add(new TestCase<TwoComposite<int[], Integer>, Integer>(
                name, 
                new TwoComposite<int[], Integer>(input1, input2),
                output));
    }

}
