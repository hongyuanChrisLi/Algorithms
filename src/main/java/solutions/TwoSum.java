package solutions;

import java.util.HashMap;

import structures.IntArrayInt;

public class TwoSum extends Solution<IntArrayInt, int[]>{
    
    @Override
    protected int[] runTest(IntArrayInt input) {
        System.out.println(input.getNum());
        return this.twoSum(input.getNumArray(), input.getNum());
    }
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        int len = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();
        
        for ( int i = 0; i < len; i++ )
        {
            
            if ( map.containsKey( target - nums[i]))
            {
                res[0] = map.get(target - nums[i]) + 1;
                res[1] = i + 1;
                break;
            }
            
             if ( ! map.containsKey(nums[i]) )
            {
                map.put(nums[i], i);
            }
            
        }
        
        
        return res;
    }



}
