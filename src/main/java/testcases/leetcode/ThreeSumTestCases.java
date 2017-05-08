package testcases.leetcode;

import java.util.List;

import base.TestCases;
import mappers.ListListIntMapper;
import structures.TestCase;
import structures.TestCaseHandler;

public class ThreeSumTestCases extends TestCases<int[], List<List<Integer>>>
        implements TestCaseHandler<int[], int[][]> {

    private static final long serialVersionUID = -8748872239505057912L;

    public ThreeSumTestCases(){
        addTestCase("Test Example 1", 
                new int[]{-1, 0, 1, 2, -1, -4}, 
                new int[][]{{-1, 0, 1}, {-1, -1, 2}});
    }
    
    @Override
    public boolean addTestCase(String name, int[] input, int[][] output) {
        return this.add(new TestCase<int[], List<List<Integer>>>(name, input, ListListIntMapper.toListList(output)));
    }

    
    
}
