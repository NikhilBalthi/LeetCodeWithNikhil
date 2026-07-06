public class MaximumSubArray {
    public int maxSubArray(int[] nums) {

        // Tracks the sum of the current subarray
        int currsum = 0;
        // Tracks the highest sum found so far initialised to the first element
        int maxsum = nums[0];

        //Iterate through each num in nums
        for(int num : nums){
            // If current sum equals becomes negative, reset it to zero
            //A negative sum can decrease the value of future subarray
            if(currsum<0){
                currsum = 0 ;
            }
            // Add the current sum to the running sum
            currsum = currsum + num;
            //Update maxsum if the newly calculated one is larger
            maxsum = Math.max(currsum,maxsum);
        }

        // Return the max subarray sum found
        return maxsum;
    }
}
