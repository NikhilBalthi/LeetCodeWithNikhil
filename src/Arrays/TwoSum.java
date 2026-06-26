package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        System.out.println("the result is " + Arrays.toString(twoSum(nums,target)));
    }

    private static int[] twoSum(int[] nums,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{i,map.get(res)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
