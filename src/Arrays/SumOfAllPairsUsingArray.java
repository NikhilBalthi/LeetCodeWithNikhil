package Arrays;

//ind   0 1 2 3 4 5
//arr [1 2 3  4 5 6 ]

// 1+2, 1+3, 1+4,1+5,1+6
// 2+3, 2+4,2+5,2+6
// 3+4,3+5,3+6
public class SumOfAllPairsUsingArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length-1 ; j++) {
                sum+=arr[i]+arr[j+1];
            }
        }
        System.out.println("sum is "+sum);
    }
}
