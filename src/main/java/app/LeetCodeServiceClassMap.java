package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import base.SolutionService;
import services.leetcode.*;

public class LeetCodeServiceClassMap extends HashMap<String, Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8073262282403642560L;
    private String maxNumStr;
    private String lastest;
    private String numRange = "";
    private List<Integer> svcNumLst = new ArrayList<Integer>();
    
    public LeetCodeServiceClassMap(){
        addClass(1, TwoSumServiceImpl.class);
        addClass(2, MedianTwoSortedArraysServiceImpl.class);
        addClass(3, AddTwoListNodeNumsServiceImpl.class);
        addClass(4, MaxSubStrWoRepeatCharServiceImpl.class);
        addClass(5, LongestPalindromeServiceImpl.class);
        addClass(6, ZigZagConvertServiceImpl.class);
        addClass(7, ReverseIntegerServiceImpl.class);
        addClass(8, StringToIntegerServiceImpl.class);
        addClass(9, PalindromeNumberServiceImpl.class);
        addClass(53, MaxSubSeqSumServiceImpl.class);
        addClass(64, MinPathSumServiceImpl.class);
        addClass(70, ClimbStairsServiceImpl.class);
        addClass(91, DecodeWaysServiceImpl.class);
        addClass(95, UniqueBinarySearchTreeIIServiceImpl.class);
        addClass(96, UniqueBinarySearchTreeServiceImpl.class);
        addClass(10, RegexMatchServiceImpl.class);
        
        procSvcNumLst();
    }
    
    private void addClass(int num, Class<? extends SolutionService> solutionClass){
        svcNumLst.add(num);
        this.put(Integer.toString(num), solutionClass);
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
