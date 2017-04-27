package testcases.leetcode;

import base.TestCases;
import structures.TestCase;
import structures.TestCaseHandler;

public class MinPathSumTestCases extends TestCases<int[][], Integer> implements TestCaseHandler<int[][], Integer>{

    private static final long serialVersionUID = 2954761522961236483L;

    public MinPathSumTestCases(){
        addTestCase("Basic Test", 
                new int[][]{
            {4, 3, 2, 1, 1},
            {4, 1, 3, 2, 2},
            {3, 1, 4, 1, 3},
            {4, 2, 3, 3, 2},
            {3, 1, 1, 2, 1}}, 16);
        
        addTestCase("Empty Input",new int[][]{}, 0);
        addTestCase("Single Row", 
                new int[][]{{4, 3, 2, 1, 1}}, 11);
        addTestCase("Single Column", 
                new int[][]{{4},{4},{3},{4},{3}}, 18);
        addTestCase("Single Element", 
                new int[][]{{2}}, 2);
    }
    
    @Override
    public boolean addTestCase(String name, int[][] input, Integer output) {
        return this.add(new TestCase<int[][], Integer>(name, input, output));
    }

}
