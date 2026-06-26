package Arrays;

public class FindLastDigitOfNumber {
    public static void main(String[] args) {
        int n = 2;
        int p = 100;
        System.out.println("first digit is " + getFirstDigit(n));
        System.out.println("last digit is " + n%10);
        System.out.println(n^p);
    }

    private static int getFirstDigit(int n) {
        int temp = n;
        while(temp/10>0){
            temp = temp/10;
        }
        return temp;
    }
}
