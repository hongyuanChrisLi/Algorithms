package testcases.leetcode;

import base.TestCases;
import java.util.Arrays;
import structures.TestCase;

import java.util.ArrayList;
import java.util.List;


public class BrickWallTestCases extends TestCases<List<List<Integer>>, Integer> {

  public BrickWallTestCases(){

    this.add(
        new TestCase<List<List<Integer>>, Integer>(
            "Test 1",
            this.genList1(),
            2
        )
    );

    this.add(
        new TestCase<List<List<Integer>>, Integer>(
            "Test 2",
            this.genList2(),
            0
        )
    );

  }

  private List<List<Integer>> genList1(){
    List<List<Integer>> wall = new ArrayList<>();
    wall.add(Arrays.asList(1, 2,2,1));
    wall.add(Arrays.asList(3,1,2));
    wall.add(Arrays.asList(1,3,2));
    wall.add(Arrays.asList(2,4));
    wall.add(Arrays.asList(3,1,2));
    wall.add(Arrays.asList(1,3,1,1));

    return wall;
  }

  private List<List<Integer>> genList2(){
    List<List<Integer>> wall = new ArrayList<>();
    wall.add(Arrays.asList(1, 2,2,1,1));
    wall.add(Arrays.asList(3,1,2,1));
    wall.add(Arrays.asList(1,3,2,1));
    wall.add(Arrays.asList(2,4,1));
    wall.add(Arrays.asList(3,1,2,1));
    wall.add(Arrays.asList(1,3,1,1,1));

    return wall;
  }


}
