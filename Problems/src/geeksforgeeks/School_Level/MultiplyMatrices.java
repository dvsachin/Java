package geeksforgeeks.School_Level;

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            int[][] b = new int[n][n];
            int[][] c = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            new MultiplyMatrices().multiply(a, b, c, n);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println(c[i][j]);
                }
            }

        }

    }
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        //add code here.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}
