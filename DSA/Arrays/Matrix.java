package DSA.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[0].length; j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));

        int[][] c = multiplication(a,b);

        System.out.println(Arrays.deepToString(c));

        int[][] x = {{2,3},{2,2}};
        int[][] y = {{1,1},{1,1}};
        int[][] z = DCMultiplication(x,y,x.length);
        System.out.println(Arrays.deepToString(z));
    }

    public static int[][] multiplication(int[][] a, int[][] b) {
        int m = a[0].length;
        int n = b.length;
        int[][] c = new int[m][n];

        if(m==n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        else {
            System.out.println("** Multiplication not possible **");
        }

            return c;
    }//this method is too time-consuming, so we'll use Divide-and-conquer method (recursive) to solve it.

    public static int[][] DCMultiplication(int[][] a, int[][] b, int n){
        int [][] c = new int[n][n];

            if(n==2) {
                c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
                c[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
                c[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
                c[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
            }
            else{
                System.out.println(" ");
            }
        return c;
    }
}
