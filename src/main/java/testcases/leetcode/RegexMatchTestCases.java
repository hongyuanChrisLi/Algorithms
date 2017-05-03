package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class RegexMatchTestCases extends TestCases<TwoComposite<String, String>, Boolean>
        implements TwoCompositeTestCaseHandler<String, String, Boolean> {

    private static final long serialVersionUID = -7834321530023564465L;

    public RegexMatchTestCases(){
        addTestCase("Test 1", "aa", "a", false);
        addTestCase("Test 2", "aa", "aa", true);
        addTestCase("Test 3", "aaa", "aa", false);
        addTestCase("Test 4", "aa", "a*", true);
        addTestCase("Test 5", "aa", ".*", true);
        addTestCase("Test 6", "ab", ".*", true);
        addTestCase("Test 7", "aab", "c*a*b*", true); 
    }
    
    @Override
    public boolean addTestCase(String name, String input1, String input2, Boolean output) {
        return this.add(new TestCase<TwoComposite<String, String>, Boolean>(name,
                new TwoComposite<String, String>(input1, input2), output));
    }

}
