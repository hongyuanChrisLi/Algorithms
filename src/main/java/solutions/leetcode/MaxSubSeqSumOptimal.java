package solutions.leetcode;

import java.util.Arrays;

/*
 * 
Optimal solution provided by:
https://discuss.leetcode.com/topic/6413/dp-solution-some-thoughts

 * 
 * */

public class MaxSubSeqSumOptimal extends MaxSubSeqSumBtmUp {
    
    @Override
    public int maxSubArray(int[] nums){
        
        int len = nums.length;
        
        if (len < 1) return Integer.MIN_VALUE;
        
        int[] ref = new int[len];
        ref[0] = nums[0];
        int maxSum = ref[0];
                
        for ( int i = 1; i < len; i++ ) {
            ref[i] = nums[i] + (ref[i-1] > 0 ? ref[i-1] : 0);
            maxSum = Math.max(maxSum, ref[i]);
            // Faster than if (maxSum < ref[i]) maxSum = ref[i];
        }
        
        //System.out.println(Arrays.toString(ref));
        
        return maxSum;
    }
    
}
