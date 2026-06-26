package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        System.out.println("after sorting result is ");
        for(int n: nums){
            System.out.print(n);
        }
    }

    public static void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int index =0 ;
//        for(int n: map.keySet()){
//            for()
//        }
    }
}
