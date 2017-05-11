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
        addTestCase("Test 2", 100, 10, 10);
        addTestCase("Test 3", 2147483647, 1, 2147483647);
        addTestCase("Test 4", 1, -1, -1);
        addTestCase("Test 5", -2147483648, 1, -2147483648);
        addTestCase("Test 6", -2147483648, 2, -1073741824);
        addTestCase("Test 7", -1010369383, -2147483648, 0);
        addTestCase("Test Overflow", -2147483648, -1, 2147483647);
    }
    
    @Override
    public boolean addTestCase(String name, Integer input1, Integer input2, Integer output) {
        return this.add(new TestCase<TwoComposite<Integer, Integer>, Integer>(
                name, 
                new TwoComposite<Integer, Integer>(input1, input2),
                output));
    }

}
