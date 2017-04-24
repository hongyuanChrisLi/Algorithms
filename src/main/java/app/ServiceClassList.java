package app;

import java.util.ArrayList;

import base.SolutionService;
import services.dp.*;
import services.leetcode.*;

public class ServiceClassList extends ArrayList<Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8073262282403642560L;
    
    public ServiceClassList(){
        this.add(TwoSumServiceImpl.class);
        this.add(MedianTwoSortedArraysServiceImpl.class);
        this.add(AddTwoListNodeNumsServiceImpl.class);
        this.add(MaxSubStrWoRepeatCharServiceImpl.class);
        this.add(LongestPalindromeServiceImpl.class);
        this.add(ZigZagConvertServiceImpl.class);
        this.add(ReverseIntegerServiceImpl.class);
        this.add(StringToIntegerServiceImpl.class);
        this.add(PalindromeNumberServiceImpl.class);
        
        this.add(MaxCommonSubSeqServiceImpl.class);
    }

}
