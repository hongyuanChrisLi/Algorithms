package solutions;

import static org.junit.Assert.assertEquals;

import base.Solution;
import structures.IntArrayIntArray;

/*
 * 
 * 
https://leetcode.com/problems/median-of-two-sorted-arrays/#/description

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 * 
 * 
 * */    
    

public class MedianTwoSortedArrays extends Solution<IntArrayIntArray, Double> {

    @Override
    protected Double runTest(IntArrayIntArray input) {
        return this.findMedianSortedArrays(input.arrayA,input.arrayB);
    }

    @Override
    protected void printOutputData(Double output) {
        System.out.println(output);
    }

    @Override
    protected void testOutput(Double outputTest, Double output) {
        assertEquals(outputTest.doubleValue(), output.doubleValue(), 0.001);
    }
   
  // [FAIL] Time Limit Exceeded  
    int[] medians = new int[2];
    int medIdx;
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        if (nums1Len == 0 && nums2Len == 0){
            return 0.0;
        }
        
        int numsLen = nums1Len + nums2Len;
        this.medIdx = numsLen / 2;
        boolean isSet = false;
        
        
        int i1 = 0, i2 = 0;
        while ( i1 < nums1Len && i2 < nums2Len && !isSet ){
            if ( nums1[i1] <= nums2[i2] ) {
                isSet = setMedians(i1 + i2, nums1[i1]);
                i1 += 1;
            } else {
                isSet = setMedians(i1 + i2, nums2[i2]);
                i2 += 1;
            }
        }
        
        while ( i1 < nums1Len && !isSet ) {
            isSet = setMedians(i1 + i2, nums1[i1]);
            i1 += 1;
        }
        
        while ( i2 < nums2Len && !isSet ) {
            isSet = setMedians(i1 + i2, nums2[i2]);
            i2 += 1;
        }
        
        if ( numsLen % 2 == 0 ){
            return  (double) ( this.medians[0] + this.medians[1] ) / 2.0;
        }
        
        return this.medians[1];
    }
    
    private boolean setMedians(int idx, int val){
        
        if (idx == this.medIdx - 1) {
            this.medians[0] = val;
        }
        
        if (idx == this.medIdx) {
            this.medians[1] = val;
            return true;
        }
        
        return false;
    }
    
/* [FAIL] Time Limit Exceeded   
 * public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        //System.out.println(Arrays.toString(nums1));
        //System.out.println(Arrays.toString(nums2));
        if (nums1Len == 0 && nums2Len == 0){
            return 0.0;
        }
        
        int numsLen = nums1Len + nums2Len;
        int[] nums = new int[numsLen];
        
        int i1 = 0, i2 = 0;
        
        while ( i1 < nums1Len && i2 < nums2Len ){
            // System.out.printf("%d, %d, %d, %d\n", i1, nums1Len, i2, nums2Len);
            if ( nums1[i1] <= nums2[i2] ) {
                // System.out.printf("Here %d, %d\n", nums1[i1], nums2[i2]);
                nums[i1+i2] = nums1[i1];
                i1 += 1;
            } else {
                // System.out.printf("There (%d, %d), (%d, %d)\n", i1, nums1[i1], i2, nums2[i2]);
                nums[i1+i2] = nums2[i2];
                i2 += 1;
            }
            // System.out.println(Arrays.toString(nums));
        }
        
        while ( i1 < nums1Len ) {
            nums[ i1 + i2 ] = nums1[i1];
            i1 += 1;
        }
        
        while ( i2 < nums2Len ) {
            nums[ i2 + i1 ] = nums2[i2];
            i2 += 1;
        }
        
        System.out.println(Arrays.toString(nums));
        
        if (numsLen % 2 == 0) {
            return (double)( nums[(numsLen - 1) / 2] + nums[numsLen / 2] ) / 2.0;
        }
        
        return (double) nums[numsLen / 2];
    }*/
}
