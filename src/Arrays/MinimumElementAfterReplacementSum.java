package Arrays;

public class MinimumElementAfterReplacementSum {
    public static void main(String[] args) {
        int arr[] = new int[]{3,1041,16,13,14};
        System.out.println(minElement(arr));
    }
    public static int minElement(int[] nums) {
        int min = nums[0];
        for(int i=0;i<nums.length;i++){

            min = Math.min(sumOfDigits(nums[i]),min);
        }
        return min;
    }
    public static int sumOfDigits(int a){
        int sum = 0;
        while(a>0){
            int digit = a%10;
            sum = sum+digit;
            a = a/10;
        }
        return sum;
    }
}
