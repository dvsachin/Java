package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DiagonalSum {
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-->0) {
            int n = Integer.parseInt(reader.readLine().trim());
            int[][] matrix = new int[n][n];

            for (int i=0;i<n; i++) {
                String[] s = reader.readLine().trim().split(" ");
                for (int j=0; j<n; j++) {
                    matrix[i][j] = Integer.parseInt(s[j]);
                }
            }
            System.out.println(new DiagonalSum().DiagonalSum(matrix));
        }

    }
    public int DiagonalSum(int[][] matrix){
        // code here
        int sum =0;
        int n = matrix.length;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j)
                    sum += matrix[i][j];
                if((i+j) == n-1)
                    sum += matrix[i][j];

            }
        }
        return sum;
    }
}
/*
Given a square matrix of size n×n. Your task is to calculate the sum of its diagonals.


Example 1:

Input: matrix = {{1, 1, 1},
{1, 1, 1}, {1, 1, 1}}
Output: 6
Example 2:

Input: matrix = {{1, 2}, {3, 4}}
Output: 10


Your Task:
You don't need to read or print anyhting. Your task is to complete the function DiagonalSum() which takes the matrix as input parameter and returns the sum of its diagonals.


Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 100
1 <= matrix elements <= 10000
 */