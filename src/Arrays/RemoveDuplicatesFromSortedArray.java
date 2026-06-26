package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] result  = removeduplicates(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] removeduplicates(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int res_index = 1;
        for(int i = 1 ;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                res[res_index] = nums[i];
                res_index++;
            }
        }
        int[] result = new int[res_index];
        for (int i = 0; i < res_index; i++) {
            result[i] = res[i];
        }
        return result;
    }
}
