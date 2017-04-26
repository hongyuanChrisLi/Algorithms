package solutions.dp;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import base.Solution;

public class ChainMatricesBtmUp extends Solution<int[], int[]> {

    @Override
    protected int[] runTest(int[] input) {
        return this.findSeq(input);
    }

    @Override
    protected void printOutputData(int[] output) {
        System.out.println(Arrays.toString(output));
    }

    @Override
    protected void testOutput(int[] outputTest, int[] output) {
        assertArrayEquals(outputTest, output);
    }

    public int[] findSeq(int[] p){
        
        return null;
    }
}
