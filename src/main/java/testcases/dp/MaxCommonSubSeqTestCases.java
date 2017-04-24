package testcases.dp;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class MaxCommonSubSeqTestCases extends TestCases<TwoComposite<String, String>, String>
        implements TwoCompositeTestCaseHandler<String, String, String> {

    private static final long serialVersionUID = 3955009442144094730L;

    public MaxCommonSubSeqTestCases() {
        addTestCase("Test Example 1", "ABAZDC", "BACBAD", "ABAD");
    }

    @Override
    public boolean addTestCase(String name, String input1, String input2, String output) {
        return this.add(new TestCase<TwoComposite<String, String>, String>(name,
                new TwoComposite<String, String>(input1, input2), output));
    }

}
