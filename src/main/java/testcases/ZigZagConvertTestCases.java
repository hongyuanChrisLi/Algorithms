package testcases;

import base.TestCases;
import structures.StringInt;
import structures.TestCase;

public class ZigZagConvertTestCases extends TestCases<StringInt, String> {

    private static final long serialVersionUID = -6828789781292057100L;
    
    public ZigZagConvertTestCases(){
        this.add(
                new TestCase<StringInt, String>(
                        "Test Example 1",
                        new StringInt("PAYPALISHIRING", 3),
                        "PAHNAPLSIIGYIR"));
    }

}
