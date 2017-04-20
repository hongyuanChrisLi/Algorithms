package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;

public class ReverseInteger extends Solution<Integer, Integer> {

    @Override
    protected Integer runTest(Integer input) {
        return this.reverse(input.intValue());
    }

    @Override
    protected void printOutputData(Integer output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Integer outputTest, Integer output) {
        assertEquals(outputTest, output);
    }
    
    public int reverse(int x) {
        return 0;
    }

}
