package Matrices;


public class RotateImage {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("before rotate is " );
        printMatrix(mat);
        //rotateMat(mat);
        System.out.println("after rotate is " );
        rotateMat(mat);
        printMatrix(mat);
    }

    private static void rotateMat(int[][] mat) {
        int n = mat.length;

        for(int i = 0 ; i<n;i++){
            for(int j=0;j<=i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int left = 0;
            int right = n-1;
            while(left<right){
                int temp  = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }

    }

    private static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(); // move to next row
        }
        System.out.println(); // extra line for separation
    }
}
