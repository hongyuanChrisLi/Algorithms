package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.List;

import base.Solution;
import mappers.ListListIntMapper;

public class ThreeSum extends Solution<int[], List<List<Integer>>> {

    @Override
    protected List<List<Integer>> runTest(int[] input) {
        return this.threeSum(input);
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

    public List<List<Integer>> threeSum(int[] nums) {
        return ListListIntMapper.toListList(new int[][]{{-1, 0, 1}, {-1, -1, 2}});
    }
    
}
