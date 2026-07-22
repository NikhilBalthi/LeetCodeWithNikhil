public class P034_GCDOfOddAndEvenSums {

    public int gcdOfOddEvenSums(int n) {
        int OddSum = n*n;
        int EvenSum = n*(n+1);

        return gcd(OddSum,EvenSum);
    }

    private int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
}
