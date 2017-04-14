package solutions;

public class MedianTwoSortedArraysBestSolution extends MedianTwoSortedArrays {

/*
 * https://discuss.leetcode.com/topic/4996/share-my-o-log-min-m-n-solution-with-explanation
 * 
 * */    
    
    int[] a, b;
    int m, n;
    
    @Override
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if ( nums1.length <= nums2.length) {
            a = nums1;
            b = nums2;
        } else {
            a = nums2;
            b = nums1;
        }
        
        m = a.length;
        n = b.length;
        int imin = 0, imax = m;
        int i, j;
        
        while (true) {
            i = (imin + imax) / 2;
            j = ( m + n + 1) / 2 - i;
            
            if ( ( i == 0 || j == n || a[i-1] <= b[j]) 
                    && ( i == m || j == 0 || a[i] > b[j-1])){
                break;
            } else if ( i != 0 && a[i-1] > b[j] ){
                imax = i;
            } else {
                imin = i + 1;
            }
        }
        
        int min_right =  get_min_right(i,j);
        int max_left = get_max_left(i,j);
        
        
        if (( m + n ) % 2 != 0) {
            return (double) min_right ;
        } else {
            return (double) (max_left + min_right) / 2.0; 
        }
    }
    
    private int get_min_right (int i, int j){
        // System.out.printf("%d, %d\n", i, j);
        if ( i == m )
            return b[j];
            
        if ( j == n )
            return a[i];
        
        return Math.min(a[i], b[j]);
        }
    
    private int get_max_left (int i, int j) {
        
        if ( i == 0 )
            return b[j-1];
        
        if ( j == 0 )
            return a[i-1];
        
        return Math.max(a[i-1], b[j-1]);  
    }
}
