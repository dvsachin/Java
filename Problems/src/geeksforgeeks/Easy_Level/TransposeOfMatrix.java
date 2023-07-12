package geeksforgeeks.Easy_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TransposeOfMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- >0) {
            int n = Integer.parseInt(in.readLine().trim());
            int[][] a = new int[n][n];

            for (int i=0;i<n;i++) {
                String[] s = in.readLine().trim().split(" ");
                for (int j=0;j<n; j++) {
                    a[i][j] =Integer.parseInt(s[j]);
                }
            }
            new TransposeOfMatrix().transpose(n,a);
            for(int i=0; i<n;i++) {
                for (int j=0; j<n;j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }



        }

    }
    public void transpose(int n,int a[][]) {
        int temp = 0;

        for(int i=0; i<n;i++) {
            for (int j = i+1; j<n;j++) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

}
