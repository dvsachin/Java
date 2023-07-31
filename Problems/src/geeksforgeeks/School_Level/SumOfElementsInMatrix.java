package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfElementsInMatrix {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum = 0;

        for(int i=0;i<N; i++) {
            for(int j=0; j<M;j++) {
                sum += Grid[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            String[] s = reader.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);

            int[][] Grid = new int[N][M];

            for (int i=0;i<N; i++) {
                String[] x = reader.readLine().split(" ");
                for (int j=0; j<M; j++) {
                    Grid[i][j] = Integer.parseInt(x[j]);
                }
            }
            System.out.println(new SumOfElementsInMatrix().sumOfMatrix(N,M,Grid));
        }

    }
}
