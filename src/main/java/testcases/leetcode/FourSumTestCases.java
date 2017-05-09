package testcases.leetcode;

import java.util.List;

import base.TestCases;
import mappers.ListListIntMapper;
import structures.TestCase;
import structures.TwoComposite;
import structures.TwoCompositeTestCaseHandler;

public class FourSumTestCases extends TestCases<TwoComposite<int[], Integer>, List<List<Integer>>>
        implements TwoCompositeTestCaseHandler<int[], Integer, int[][]> {

    private static final long serialVersionUID = 5625512211635767028L;

    public FourSumTestCases (){
        addTestCase("Test Example", new int[]{1, 0, -1, 0, -2, 2}, 0, 
                new int[][]{
            {-1,  0, 0, 1},
            {-2, -1, 1, 2},
            {-2,  0, 0, 2}
        });
    }
    
    @Override
    public boolean addTestCase(String name, int[] input1, Integer input2, int[][] output) {
        return this.add(new TestCase<TwoComposite<int[], Integer>, List<List<Integer>>>(
                name, 
                new TwoComposite<int[], Integer>(input1, input2), 
                ListListIntMapper.toListList(output)));
    }

}
