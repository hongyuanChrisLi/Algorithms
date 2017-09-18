package testcases.leetcode;

import java.util.Arrays;
import java.util.List;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class FindSubStringFromWordsTestCases extends TestCases<TwoComposite<String, String[]>, List<Integer>>
        implements TwoCompositeTestCaseHandler<String, String[], List<Integer>> {

    private static final long serialVersionUID = -4054479825278440414L;

    public FindSubStringFromWordsTestCases(){
        addTestCase("Test Example", "barfoothefoobarman", new String[]{"foo", "bar"}, Arrays.asList(0,9));
    }
    
    @Override
    public boolean addTestCase(String name, String input1, String[] input2, List<Integer> output) {
        return this.add(new TestCase<TwoComposite<String, String[]>, List<Integer>>(name, 
                new TwoComposite<String, String[]>(input1, input2), output));
    }

}
