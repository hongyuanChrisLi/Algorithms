package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TwoComposite;

public class ZigZagConvertTestCases extends TestCases<TwoComposite<String, Integer>, String> {

    private static final long serialVersionUID = -6828789781292057100L;
    
    public ZigZagConvertTestCases(){
        
        addTestCase("Test Example 1","PAYPALISHIRING",3,"PAHNAPLSIIGYIR");
        addTestCase("Test 2 Rows","PAYPALISHIRING",2,"PYAIHRNAPLSIIG");
        addTestCase("Test 4 Rows","PAYPALISHIRING",4,"PINALSIGYAHRPI");
        addTestCase("Test 0 Row","PAYPALISHIRING",0,"PAYPALISHIRING");
        addTestCase("Test 1 Row","PAYPALISHIRING",1,"PAYPALISHIRING");
        addTestCase("Test RowNum >= StrLen","PAYPA",6,"PAYPA");
    }
    
    private void addTestCase(String name, String inputStr, int num, String outputStr){
        this.add(
                new TestCase<TwoComposite<String, Integer>, String>(
                        name,
                        new TwoComposite<String, Integer>(inputStr, num),
                        outputStr)); 
    }

}
