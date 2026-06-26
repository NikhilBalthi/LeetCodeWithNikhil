package Arrays;

//1
//1 2
//1 2 3
//1 2 3 4

public class Pattern1 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
        System.out.println((char)65);
    }
}
