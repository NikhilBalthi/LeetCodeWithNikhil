package Arrays;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    sum+=arr[i]+arr[j]+arr[k];
                }
            }
        }
        System.out.println("sum is "+sum);
    }
}
