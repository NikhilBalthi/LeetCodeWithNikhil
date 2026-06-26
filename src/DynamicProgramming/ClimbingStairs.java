package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 4;
        int result = climb(n);
        System.out.println("the result is " +result);
    }

    private static int climb(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
