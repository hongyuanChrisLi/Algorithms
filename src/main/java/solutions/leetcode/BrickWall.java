package solutions.leetcode;


import static org.junit.Assert.assertEquals;

import base.Solution;
import base.TestCases;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import testcases.leetcode.BrickWallTestCases;

public class BrickWall extends Solution<List<List<Integer>>, Integer> {

  @Override
  protected Integer runTest(List<List<Integer>> input) {
    return this.leastBricks(input);
  }

  @Override
  protected void printOutputData(Integer output) {
    System.out.println(output);
  }

  @Override
  protected void testOutput(Integer outputTest, Integer output) {
    assertEquals(outputTest,output);
  }

  @Override
  protected TestCases<List<List<Integer>>, Integer> genTestCases() {
    return new BrickWallTestCases();
  }

  public int leastBricks(List<List<Integer>> wall) {

    Map<Integer, Integer> cracks = new HashMap<Integer, Integer>();
    int maxCrack = 0;
    int rowNum = wall.size();

    for (List<Integer> row : wall) {
      int curCrack = 0;
      for ( int i = 0; i < row.size() -1 ; i++){
        curCrack += row.get(i);
        int val = cracks.getOrDefault(curCrack, 0) + 1;
        cracks.put(curCrack, val);
        maxCrack = Math.max(maxCrack, val);
      }
    }

    return rowNum - maxCrack;
  }


  public int leastBricks_v1(List<List<Integer>> wall) {

    /*
    *Memory Limit Exceeded
    *Last executed input: [[100000000],[100000000],[100000000]]
    * */

    int width = 0;

    for (Integer brick : wall.get(0)){
      width += brick;
    }

    int[] cracks = new int[width + 1];

    for (List<Integer> row : wall) {
      int curCrack = 0;

      for (Integer brick : row) {
        curCrack += brick;
        cracks[curCrack] += 1;
      }
    }

    int maxCrack = 0;
    int rowNum = wall.size();

    for ( int i = 0; i < width; i++)
      maxCrack = Math.max(maxCrack, cracks[i]);

    return rowNum - maxCrack;
  }

}
