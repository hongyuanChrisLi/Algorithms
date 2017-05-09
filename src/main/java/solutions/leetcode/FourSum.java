package solutions.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import base.Solution;
import base.TestCases;
import structures.TwoComposite;
import testcases.leetcode.FourSumTestCases;

/*
 * 
https://leetcode.com/problems/4sum/#/description

Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
Find all unique quadruplets in the array which gives the sum of target.

Note: The solution set must not contain duplicate quadruplets.

For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]

 * 
 * */


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
        
        int numsLen = nums.length;
        if (numsLen < 4) return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int upLim = numsLen - 2;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int aPre = nums[0] - 1;
        
        for (int i = 0; i < upLim; i++) {
            if (nums[i] == aPre) continue;
            int bPre = aPre;
            for (int j = i+1; j < upLim; j++){
                if (nums[j] == bPre) continue;
                int abSum = nums[i] + nums[j];
                int cdTarget = target - abSum;
                int lo = j + 1;
                int hi = numsLen - 1;
                while (lo < hi) {
                    int curLoNum = nums[lo], curHiNum = nums[hi];
                    int cdSum = curLoNum + curHiNum;
                    //System.out.printf("i:%d, j:%d, lo:%d, hi:%d, abSum:%d, cdSum:%d\n", i, j, lo, hi, abSum, cdSum);
                    if (cdSum == cdTarget) {
                        res.add(new ArrayList<Integer>(
                                Arrays.asList(nums[i], nums[j], nums[lo], nums[hi])));
                        while (lo < hi && nums[lo] == curLoNum) lo++;
                        while (lo < hi && nums[hi] == curHiNum) hi--;
                    }else if (cdSum < cdTarget) lo++;
                    else hi--;
                }
                bPre = nums[j];
            }
            aPre = nums[i];
        }
        return res;
    }
    
}
