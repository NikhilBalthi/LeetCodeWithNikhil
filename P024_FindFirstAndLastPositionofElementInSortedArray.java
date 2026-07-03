public class FindFirstAndLastPositionofElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left_result  = left_most(nums,target,n);
        int right_result = right_most(nums,target,n);
        return new int[]{left_result,right_result};
    }

    private int left_most(int[] nums,int target,int n){
        int left = 0, right = n-1;
        int left_most=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                left_most = mid;
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return left_most;
    }
    private int right_most(int[] nums,int target,int n){
        int left = 0, right = n-1;
        int right_most=-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                right_most = mid;
                left = mid+1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return right_most;
    }
}
