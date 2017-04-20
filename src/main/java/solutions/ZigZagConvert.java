package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;
import structures.StringInt;

public class ZigZagConvert extends Solution<StringInt, String> {

    @Override
    protected String runTest(StringInt input) {
        return this.convert(input.s, input.num);
    }

    @Override
    protected void printOutputData(String output) {
        System.out.print(output);
    }

    @Override
    protected void testOutput(String outputTest, String output) {
        assertEquals(outputTest, output);
    }

    public String convert(String s, int numRows) {
        return s;
    }
    
}
