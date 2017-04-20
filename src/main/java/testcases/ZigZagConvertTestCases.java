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
        this.add(
                new TestCase<StringInt, String>(
                        "Test 2 Rows",
                        new StringInt("PAYPALISHIRING", 2),
                        "PYAIHRNAPLSIIG")); 
        this.add(
                new TestCase<StringInt, String>(
                        "Test 4 Rows",
                        new StringInt("PAYPALISHIRING", 4),
                        "PINALSIGYAHRPI"));
        this.add(
                new TestCase<StringInt, String>(
                        "Test 0 Row",
                        new StringInt("PAYPALISHIRING", 0),
                        "PAYPALISHIRING")); 
        this.add(
                new TestCase<StringInt, String>(
                        "Test 1 Row",
                        new StringInt("PAYPALISHIRING", 1),
                        "PAYPALISHIRING")); 
        this.add(
                new TestCase<StringInt, String>(
                        "Test RowNum >= StrLen",
                        new StringInt("PAYPA", 6),
                        "PAYPA")); 
    }

}
