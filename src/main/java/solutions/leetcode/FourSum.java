package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.FourSumTestCases;

public class FourSum extends Solution<TwoComposite<int[], Integer>, List<List<Integer>>> {

    @Override
    protected List<List<Integer>> runTest(TwoComposite<int[], Integer> input) {
        return fourSum(input.var1, input.var2);
    }

    @Override
    protected void printOutputData(List<List<Integer>> output) {
        System.out.println("");
        int rowNum = output.size();
        for (int i = 0; i < rowNum; i++ )
            System.out.println("\t\t" + output.get(i).toString());
    }

    @Override
    protected void testOutput(List<List<Integer>> outputTest, List<List<Integer>> output) {
        int rowNum = outputTest.size();
        assertEquals(rowNum, output.size()); 
        
        for (int i = 0; i < rowNum; i++) {
            boolean isElem = false;
            for (int j = 0; j< rowNum; j++) {
                boolean sameSize = output.get(i).size() == outputTest.get(j).size();
                boolean containAll = output.get(i).containsAll(outputTest.get(j));
                isElem = isElem || (sameSize && containAll);
            }
            assertEquals(true, isElem);
        }
    }

    @Override
    protected TestCases<TwoComposite<int[], Integer>, List<List<Integer>>> genTestCases() {
        return new FourSumTestCases();
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        return new ArrayList<List<Integer>>();
    }
    
}
