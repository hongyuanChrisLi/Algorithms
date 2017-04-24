package testcases.dp;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;

public class MaxCommonSubSeqTestCases extends TestCases<TwoComposite<String, String>, String> {

    private static final long serialVersionUID = 3955009442144094730L;
    
    public MaxCommonSubSeqTestCases () {
        addTestCase("Test Example 1", "ABAZDC", "BACBAD", "ABAD");
    }
    
    private void addTestCase(String name, String inStr1, String inStr2, String outStr) {
        this.add(new TestCase<TwoComposite<String, String>, String>(
                name, 
                new TwoComposite<String, String>(inStr1, inStr2),
                outStr));
    }

}
