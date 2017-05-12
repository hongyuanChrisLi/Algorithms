package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class ImplStrStrTestCases extends TestCases<TwoComposite<String, String>, Integer>
        implements TwoCompositeTestCaseHandler<String, String, Integer> {

    private static final long serialVersionUID = 8948210776949165789L;

    public ImplStrStrTestCases(){
        addTestCase("Test 1", "abcdedf", "cde", 2);
        addTestCase("Test 2", "abc", "cde", -1);
        addTestCase("Test 3", "cd", "cde", -1);
        addTestCase("Test 4", "aojasdofjawerfjwelrwaeasdflsdaf", "jaw", 8);
        addTestCase("Test 4", "a", "", 0);
    }
    
    @Override
    public boolean addTestCase(String name, String input1, String input2, Integer output) {
        return this.add(new TestCase<TwoComposite<String, String>, Integer>(name, 
                new TwoComposite<String, String>(input1, input2), output));
    }

}
