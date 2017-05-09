package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.Solution;
import base.TestCases;
import testcases.leetcode.ThreeSumTestCases;


/*
 * 
https://leetcode.com/problems/3sum/#/description
https://discuss.leetcode.com/topic/8125/concise-o-n-2-java-solution

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 * 
 * */

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
        
        Arrays.sort(nums);
        int upperLim = nums.length - 2;
        int preNum = upperLim > 0 ? nums[0] - 1: 0;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for (int i=0; i < upperLim; i++  ){
            int iStart = i + 1;
            int iEnd = upperLim + 1;
            int target = -nums[i];
            if (nums[i] == preNum) continue;
            
            while(iStart < iEnd ) {
                int curStartNum = nums[iStart];
                int curEndNum = nums[iEnd];
                int twoSum = curStartNum + curEndNum;
                if (twoSum == target) {
                    res.add(Arrays.asList(nums[i], curStartNum, curEndNum));
                    while(iStart < iEnd && nums[iStart] == curStartNum) iStart++;
                    while(iStart < iEnd && nums[iEnd] == curEndNum ) iEnd--;
                }
                else if (twoSum > target) iEnd--;
                else iStart++;
                }
            preNum = nums[i];
        }
        return res;
    }

    @Override
    protected TestCases<int[], List<List<Integer>>> genTestCases() {
        return new ThreeSumTestCases();
    }
    
}
