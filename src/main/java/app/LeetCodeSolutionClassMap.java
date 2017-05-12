package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import base.Solution;
import solutions.leetcode.*;


public class LeetCodeSolutionClassMap extends HashMap<String, List<Class<? extends Solution<?,?>>>> {
    private static final long serialVersionUID = 8073262282403642560L;
    private String maxNumStr;
    private String lastest;
    private String numRange = "";
    private List<Integer> svcNumLst = new ArrayList<Integer>();
    
    public LeetCodeSolutionClassMap(){
        addClass(1, TwoSum.class);
        addClass(2, MedianTwoSortedArrays.class);
        addClass(2, MedianTwoSortedArraysBestSolution.class);
        addClass(3, AddTwoListNodeNums.class);
        addClass(3, AddTwoListNodeNumsOptimized.class);
        addClass(4, MaxSubStrWoRepeatChar.class);
        addClass(5, LongestPalindrome.class);
        addClass(6, ZigZagConvert.class);
        addClass(7, ReverseInteger.class);
        addClass(8, StringToInteger.class);
        addClass(9, PalindromeNumber.class);
        addClass(53, MaxSubSeqSumBtmUp.class);
        addClass(53, MaxSubSeqSumOptimal.class);
        addClass(64, MinPathSum.class);
        addClass(70, ClimbStairs.class);
        addClass(91, DecodeWays.class);
        addClass(95, UniqueBinarySearchTreeII.class);
        addClass(96, UniqueBinarySearchTree.class);
        addClass(10, RegexMatch.class);
        addClass(11, MaxArea.class);
        addClass(12, IntegerToRoman.class);
        addClass(13, RomanToInteger.class);
        addClass(14, MaxCommonPrefix.class);
        addClass(15, ThreeSum.class);
        addClass(16, ThreeSumClosest.class);
        addClass(17, PhoneNumToLetters.class);
        addClass(18, FourSum.class);
        addClass(19, RmNthFromEnd.class);
        addClass(20, ValidBrackets.class);
        addClass(21, MergeTwoSortedLists.class);
        addClass(29, DivideTwoInt.class);
        addClass(22, GenParentheses.class);
        addClass(23, MergeKLists.class);
        addClass(24, SwapNodePairs.class);
        addClass(25, ReverseKGroup.class);
        addClass(26, RmDuplicates.class);
        addClass(27, RmElements.class);
        
        procSvcNumLst();
    }
    
    private void addClass(int num, Class<? extends Solution<?,?>> solutionClass){
        
        String key = Integer.toString(num);
        
        if (this.containsKey(key)){
            this.get(key).add(solutionClass);
        } else {
            svcNumLst.add(num);
            List<Class<? extends Solution<?,?>>> classLst = new ArrayList<Class<? extends Solution<?,?>>>();
            classLst.add(solutionClass);
            this.put(key, classLst);
        } 
    }
    
    private void procSvcNumLst(){
        int lstLen = svcNumLst.size();
        lastest = Integer.toString(svcNumLst.get(lstLen - 1));
        Collections.sort(svcNumLst);
        maxNumStr = Integer.toString(svcNumLst.get(lstLen - 1));
        
        Integer startNum = 0, endNum = 0;
        numRange = "[";
        svcNumLst.add(0); // End number
        
        for(Integer num : svcNumLst){
            // System.out.println(num);
            if (startNum == 0){
                startNum = num;
                endNum = startNum;
                // System.out.println("New start");
            } else if ( num == endNum + 1){
                endNum = num;
                // System.out.println("New End");
            } else {
                if (startNum == endNum) 
                    numRange += Integer.toString(startNum) + ", ";
                else
                    numRange += Integer.toString(startNum) + "-" + Integer.toString(endNum) + ", ";       
                startNum = num;
                endNum = startNum;
            }
        }
        int lastCommaIdx = numRange.lastIndexOf(',');
        numRange = numRange.substring(0, lastCommaIdx) + "]";
    }
    
    public String getTotStr() {
        return Integer.toString(this.size());
    }

    public String getMaxNumStr() {
        return maxNumStr;
    }

    public String getLastest() {
        return lastest;
    }

    public String getNumRange() {
        return numRange;
    }
}
