package Arrays;

import java.util.*;

public class Remove {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
//        Set<Integer> s = new HashSet<>();
//        for (int i = 0; i <nums.length ; i++) {
//            s.add(nums[i]);
//        }
//        System.out.println("size is " +s.size());
//        System.out.println();
//        List<Integer> l = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//
//        }
//        for (int i = 0; i < nums.length; i++) {
//
//        }
        int count = 0;
        for(int n : nums){
            if(n!=val){
                count+=1;
            }
        }
        System.out.println(count-1);

    }
}
