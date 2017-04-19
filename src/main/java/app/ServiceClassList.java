package app;

import java.util.ArrayList;

import base.SolutionService;
import services.AddTwoListNodeNumsServiceImpl;
import services.LongestPalindromeServiceImpl;
import services.MaxSubStrWoRepeatCharServiceImpl;
import services.MedianTwoSortedArraysServiceImpl;
import services.TwoSumServiceImpl;

public class ServiceClassList extends ArrayList<Class<? extends SolutionService>> {
    private static final long serialVersionUID = 8073262282403642560L;
    
    public ServiceClassList(){
        this.add(TwoSumServiceImpl.class);
        this.add(MedianTwoSortedArraysServiceImpl.class);
        this.add(AddTwoListNodeNumsServiceImpl.class);
        this.add(MaxSubStrWoRepeatCharServiceImpl.class);
        this.add(LongestPalindromeServiceImpl.class);
    }

}
