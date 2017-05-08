package mappers;

import java.util.ArrayList;
import java.util.List;

public class ListListIntMapper {

    public static List<List<Integer>> toListList (int[][] nums) {
        
        int rowNum = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        
        for (int i = 0; i < rowNum; i++){
            int colNum = nums[i].length;
            List<Integer> rowList = new ArrayList<Integer>();
            for (int j = 0; j < colNum; j++){
                rowList.add(nums[i][j]);
            }
            res.add(rowList);
        }
        return res;
    }
}
