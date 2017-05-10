package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class DivideTwoIntTestCases extends TestCases<TwoComposite<Integer, Integer>, Integer>
        implements TwoCompositeTestCaseHandler<Integer, Integer, Integer> {

    private static final long serialVersionUID = 2955445576792901339L;

    public DivideTwoIntTestCases(){
        addTestCase("Test 1", 5, 3, 1);
    }
    
    @Override
    public boolean addTestCase(String name, Integer input1, Integer input2, Integer output) {
        return this.add(new TestCase<TwoComposite<Integer, Integer>, Integer>(
                name, 
                new TwoComposite<Integer, Integer>(input1, input2),
                output));
    }

}
