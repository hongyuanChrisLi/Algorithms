package app;

import java.util.HashMap;

import base.SolutionService;
import services.leetcode.*;

public class LeetCodeServiceClassMap extends HashMap<String, Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8073262282403642560L;
    private int maxNum;
    private int lastest;
    
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
    }
    
    private void addClass(int num, Class<? extends SolutionService> solutionClass){
        lastest = num;
        if ( num > maxNum) maxNum = num;
        this.put(Integer.toString(num), solutionClass);
    }
    
    public String getTotStr() {
        return Integer.toString(this.size());
    }

    public String getMaxNumStr() {
        return Integer.toString(maxNum);
    }

    public String getLastest() {
        return Integer.toString(lastest);
    }

}
