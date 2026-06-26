package Arrays;

public class MaxPairSumAmongTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{4,5,6,7};
        int max_sum = 0;

        //4 + 7 = 11

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                max_sum = Math.max(max_sum , arr1[i]+arr2[j]);
            }
        }
        System.out.println("max_sum "+max_sum);
    }
}
