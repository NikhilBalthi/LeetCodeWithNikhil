package Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4};
        int[] ans = new int[a.length];

        for(int i = 0;i<a.length;i++){
            int prod = 1;
            for(int j = 0 ; j<a.length;j++){
                if(i==j) continue;
                prod*=a[j];
            }
            ans[i] = prod;
        }

        for (int i : ans){
            System.out.println(i);
        }
    }
}
