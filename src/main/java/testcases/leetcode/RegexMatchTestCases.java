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
        addTestCase("Test 8", "caab", "ca*c*b", true);
        addTestCase("Test 9", "caab", "cda*b", false);
        addTestCase("Test 10", "caaddeb", "ca*.*b", true);
        addTestCase("Test 11", "", ".*", true);
        addTestCase("Test 12", "", "", true);
        addTestCase("Test 13", "a", "", false);
        addTestCase("Test 14", "aaa", "ab*ac*a", true);
        addTestCase("Test 15", "ab", ".*..", true);
        addTestCase("Test 16", "a", "ab*a", false);
        addTestCase("Test 17", "", "c*", true);
        addTestCase("Test 18", "", "c*c*", true);
        addTestCase("Test 19", "b", "aaa.", false);
        addTestCase("Test 20", "", "..*", false);
    }
    
    @Override
    public boolean addTestCase(String name, String input1, String input2, Boolean output) {
        return this.add(new TestCase<TwoComposite<String, String>, Boolean>(name,
                new TwoComposite<String, String>(input1, input2), output));
    }

}
