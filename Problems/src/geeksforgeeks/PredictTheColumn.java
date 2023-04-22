package geeksforgeeks;

import java.util.Scanner;

public class PredictTheColumn {
    static int columnWithMaxZero(int a[][],int n){

        // Your code here
        int count = 0, countMax = 0, index = 0;
        for(int i = 0; i<n; i++) {
            count = 0;
            for(int j = 0; j<n; j++) {
                if(a[j][i] == 0) count++;
            }
            if(count > countMax) {
                countMax = count;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[][] multiArray = new int[n][n];

        for(int i =0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                multiArray[i][j] = scanner.nextInt();
            }
        }
//        int[][] multiArray = {{0,1,0},{0,0,1},{0,1,0}};
//        int[][] multiArray = {{1,1,0},{1,1,0},{1,1,0}};
        // size is n*n
        System.out.println(columnWithMaxZero(multiArray,n));
    }
}

/*
Given a matrix(2D array) M of size N*N consisting of 0s and 1s only. The task is to find the column with maximum number of 0s.

Example 1:

Input:
3
1 1 0
1 1 0
1 1 0

Output:
2

Explanation:
2nd column (0-based indexing) is having 3 zeros which is maximum.
Example 2:

Input:
3
0 1 0
0 0 1
0 1 0

Output:
0

Explanation:
0th column (0-based indexing) is having 3 zeros which is maximum.

Constraints:
1 <= N <= 102
0 <= A[i][j] <= 1
User Task:
Your task is to complete the function columnWithMaxZero() which should return the column number with maximum number of zeros. If more than one column exists, print the one which comes first.
 */

/*
TestCase:
65
0 0 1 1 1 1 1 0 0 0 0 0 1 0 1 0 0 1 0 1 1 0 1 0 1 0 0 1 0 1 1 0 0 1 1 1 1 1 0 0 1 0 0 0 0 0 1 1 1 0 1 1 0 1 1 1 0 1 0 0 0 0 1 0 0
0 0 1 1 0 0 0 0 1 0 0 1 0 0 0 0 0 1 1 0 1 1 0 1 0 0 1 0 1 1 0 0 1 1 1 1 1 0 1 1 0 1 0 1 0 0 0 1 0 0 0 1 0 1 0 0 0 1 0 1 0 0 1 0 0
1 0 1 0 1 0 0 1 0 0 0 1 0 0 0 0 1 1 0 0 0 1 0 0 1 1 0 1 1 1 0 1 0 1 1 1 0 1 1 0 0 1 0 0 0 0 1 1 1 0 1 1 0 1 1 1 1 1 1 1 1 0 0 1 1
0 0 1 0 1 1 1 1 0 0 1 1 1 0 1 0 1 1 0 1 1 0 0 0 0 1 0 1 1 0 0 0 0 0 0 0 1 0 1 0 1 0 0 1 0 1 0 0 1 1 0 1 0 1 0 1 0 0 0 1 1 0 0 1 1
1 1 0 1 1 0 1 1 0 0 0 1 0 1 0 1 1 1 0 0 1 0 1 1 0 0 0 1 0 0 1 0 1 0 1 0 1 0 0 1 0 1 1 1 1 0 0 1 1 1 1 0 0 0 0 0 1 1 0 0 0 1 1 0 0
1 0 0 0 0 0 1 0 1 1 1 0 0 1 0 1 0 1 1 0 0 1 1 1 0 0 0 1 1 1 1 0 1 0 0 0 1 0 0 0 1 0 1 0 1 0 1 1 1 1 1 0 0 0 1 0 0 0 1 1 0 1 0 1 0
0 1 0 1 1 1 0 0 0 0 1 1 0 0 0 0 1 1 1 1 0 1 1 0 1 0 1 1 0 1 0 0 1 1 1 0 0 0 1 1 0 0 1 1 0 1 0 1 0 0 1 1 1 0 0 1 0 0 0 0 0 1 1 0 0
0 1 1 1 0 1 0 0 0 0 1 1 1 1 1 1 0 1 0 0 0 0 0 1 1 0 1 0 1 1 1 1 1 1 0 0 1 0 1 1 1 0 0 0 1 0 1 1 1 1 1 0 1 0 0 0 0 1 0 1 1 1 1 1 1
1 1 0 0 0 0 0 1 1 0 0 0 1 1 1 0 1 1 0 1 0 1 0 0 0 0 0 0 1 0 1 1 1 0 1 0 1 1 0 1 1 1 1 1 1 1 1 0 1 0 1 0 0 1 1 1 1 0 0 1 1 0 0 0 1
0 0 1 1 0 0 1 1 0 0 0 1 0 0 0 1 0 1 0 0 0 0 1 1 0 0 0 0 1 1 0 1 0 0 0 0 1 1 0 1 1 0 1 1 0 0 1 1 0 1 1 0 1 0 1 0 0 1 0 1 0 1 1 1 1
1 1 0 0 0 1 1 0 0 1 0 1 0 1 1 0 0 1 1 1 0 0 1 0 1 0 0 0 1 0 1 0 1 1 1 1 1 0 1 1 1 1 0 1 0 0 1 0 1 0 1 0 1 1 0 1 1 0 0 1 0 0 0 0 1
1 0 1 1 0 1 1 0 0 0 1 1 1 1 0 1 1 1 0 0 1 1 1 1 1 1 1 0 0 0 0 1 0 1 1 1 0 1 1 0 0 0 0 0 1 0 1 1 1 1 1 0 0 0 0 1 1 1 0 0 0 0 1 0 0
0 0 0 0 1 1 0 1 0 0 1 0 0 0 0 1 0 0 0 0 0 1 0 1 0 1 0 0 1 0 1 1 1 0 1 1 1 1 0 1 0 1 0 1 1 1 1 1 0 1 0 0 1 1 1 0 0 0 0 0 1 1 0 1 0
1 1 0 0 1 1 0 0 1 0 1 1 0 1 1 0 0 1 1 0 0 0 0 1 1 1 0 0 0 1 0 1 0 1 1 0 0 1 0 0 1 1 0 0 1 0 0 0 0 0 1 0 0 1 0 1 0 0 0 1 0 0 0 0 0
1 1 0 1 0 0 0 1 0 1 1 1 1 1 1 1 0 1 1 0 1 0 0 1 1 1 1 1 1 0 0 0 0 0 1 0 1 1 1 1 0 1 1 1 1 1 1 0 0 0 1 0 0 1 1 1 1 0 0 1 1 1 1 1 0
1 1 1 1 0 1 0 0 0 0 1 1 0 1 1 1 0 0 0 1 0 0 1 0 0 1 1 0 0 1 0 0 1 0 0 0 1 0 1 1 1 1 1 0 0 1 0 0 0 0 0 1 0 1 0 1 1 0 0 1 1 0 0 0 0
1 1 1 1 0 0 0 0 0 1 1 1 1 0 1 1 1 1 1 1 0 0 0 0 1 0 0 0 0 0 1 0 1 1 0 0 1 1 0 0 1 1 1 1 1 0 1 1 1 0 0 1 1 1 0 1 0 1 1 0 1 1 0 0 0
1 0 0 1 0 0 0 0 0 0 0 1 0 1 1 1 1 1 1 0 0 0 1 1 1 1 0 1 1 1 0 1 1 1 1 0 0 0 0 1 1 1 1 0 1 0 0 1 0 1 0 1 1 1 1 0 0 1 1 0 0 1 0 0 1
0 0 0 0 1 1 0 0 0 1 1 0 1 0 1 1 0 1 1 0 0 1 1 1 1 1 0 0 0 0 1 0 0 1 0 1 0 1 0 1 1 1 0 0 1 1 1 1 1 0 0 0 1 0 0 1 1 1 0 0 1 1 0 0 0
0 0 0 0 1 1 1 1 1 0 1 1 0 1 0 0 0 0 1 1 0 0 0 0 0 0 0 0 0 1 1 1 0 1 1 0 0 0 0 1 0 1 0 0 0 1 0 1 0 0 0 0 0 1 0 0 0 0 0 0 1 0 0 1 0
0 0 1 1 0 0 1 1 1 1 1 0 1 0 1 0 1 1 1 1 1 0 0 0 0 1 0 0 1 1 1 0 1 1 0 0 1 0 1 0 0 0 0 0 0 1 1 0 0 0 0 1 0 0 1 0 0 0 1 1 1 1 0 1 0
0 1 1 1 0 0 1 0 0 0 1 0 1 1 1 0 0 0 1 0 0 0 0 0 1 0 1 0 0 1 0 0 0 1 0 0 1 0 1 1 1 0 0 0 0 1 0 1 1 0 0 1 1 0 1 0 0 1 0 1 0 1 1 0 0
0 1 0 1 0 1 0 1 1 1 1 1 0 1 1 1 0 0 1 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 0 0 0 1 1 0 0 1 1 0 0 1 1 1 1 0 1 0 1 0 1 1 1 0 1 0 0 0 1 1 0
0 0 1 0 0 1 1 0 0 0 1 0 1 1 1 1 1 1 1 1 0 0 1 0 1 0 0 1 1 1 0 1 0 1 0 0 1 1 1 0 1 0 0 1 0 0 1 1 1 1 0 1 0 0 0 0 1 0 1 1 1 0 1 0 1
1 1 0 0 1 0 0 0 1 0 0 0 1 0 1 0 1 0 0 1 1 1 1 0 0 0 0 0 0 1 0 1 1 1 1 0 1 0 1 0 0 0 0 1 0 1 0 1 1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 0 1
0 0 0 1 0 1 0 1 0 0 0 1 0 1 1 1 1 1 1 0 0 0 0 1 0 1 1 1 1 1 1 0 0 0 0 1 0 0 0 0 0 1 0 1 1 1 1 1 1 1 0 0 0 1 1 1 1 1 0 1 1 0 1 0 0
1 1 0 0 1 1 1 0 1 0 0 0 1 0 1 1 0 0 1 1 0 0 1 0 0 0 1 1 1 1 0 0 0 0 0 1 1 0 0 1 1 0 1 1 1 0 1 1 1 0 0 0 0 0 1 0 1 1 0 1 1 1 0 1 0
1 1 1 0 0 1 1 1 1 0 0 0 1 0 0 1 0 1 1 1 0 1 0 1 1 1 1 1 1 1 0 0 0 1 0 0 1 0 0 1 0 0 1 0 0 0 1 0 1 0 0 1 0 1 0 1 0 0 1 0 1 1 0 1 0
0 1 0 1 1 1 0 1 1 1 1 0 1 0 1 0 1 0 1 0 0 0 0 0 1 0 0 1 0 1 1 0 0 0 0 1 0 1 1 0 1 1 0 1 1 1 1 1 0 0 0 0 0 0 0 1 0 1 1 1 0 0 1 1 1
1 1 0 0 0 0 0 1 0 0 0 0 0 1 1 1 0 0 1 0 1 0 1 1 0 0 1 1 0 1 0 1 1 0 0 1 0 1 0 1 0 0 0 0 1 0 1 0 0 1 1 1 0 1 0 1 1 1 1 1 1 0 1 0 1
0 0 0 0 1 1 0 0 1 1 1 1 0 1 0 1 0 0 1 1 0 0 0 1 1 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 1 0 1 0 1 1 1 1 1 0 0 0 1 1 0 1 0 1 1 0 0 0 1 1
1 1 0 1 0 0 0 0 1 1 1 0 0 1 0 1 1 0 1 1 0 0 0 0 1 0 1 1 0 0 0 0 1 1 0 1 0 0 1 1 1 0 1 1 0 0 0 1 0 1 0 0 0 0 0 1 1 1 1 1 0 0 0 1 0
1 1 1 1 0 1 0 1 1 1 1 1 0 0 0 0 0 0 1 0 1 0 1 0 0 0 1 1 0 1 1 0 1 0 0 1 0 0 0 1 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 1 1 1 1 0 0 1 0 0 0
1 1 0 0 0 0 0 1 1 0 1 1 1 1 1 1 0 0 0 1 1 1 0 0 1 0 1 1 1 1 1 0 0 1 0 1 0 1 0 0 0 1 1 0 0 1 0 0 0 1 1 1 1 0 1 1 1 0 1 0 1 0 1 0 1
0 1 0 1 0 0 1 1 1 0 0 0 1 0 1 1 1 0 0 1 1 0 0 0 0 1 1 1 1 0 0 1 1 0 1 1 1 1 0 0 0 1 0 0 0 1 0 1 1 1 1 1 1 0 0 1 1 1 1 1 0 1 0 0 0
0 1 0 1 0 0 0 1 1 0 1 1 1 1 0 0 1 0 1 1 1 1 1 0 1 0 1 0 1 0 0 1 0 0 0 0 1 1 1 0 0 0 0 1 1 1 1 0 1 0 0 0 1 1 1 0 0 0 0 1 1 1 0 1 0
0 0 0 0 1 1 0 0 0 0 1 0 0 0 0 1 0 0 1 1 0 1 0 1 1 1 0 1 1 1 1 0 1 1 0 1 0 1 1 0 0 0 0 1 1 0 1 0 1 0 0 0 0 1 0 1 1 1 0 1 1 1 1 1 1
1 1 0 0 0 0 1 0 1 1 0 0 1 0 1 0 0 0 0 1 1 1 1 0 0 1 1 0 0 1 0 1 0 0 1 1 0 0 0 0 0 0 1 0 1 0 0 1 0 1 0 1 0 1 1 1 0 1 0 0 1 0 0 1 0
0 0 1 1 1 1 1 0 0 0 1 1 0 0 1 1 1 0 1 0 0 1 0 0 0 1 1 0 0 1 0 1 1 1 1 0 0 1 1 1 1 1 1 1 1 0 0 1 1 1 0 1 1 0 0 0 0 1 1 1 0 1 1 0 1
0 1 1 1 1 0 1 0 0 0 1 0 0 0 0 0 0 0 0 1 1 0 0 0 1 0 0 1 0 0 0 1 0 0 0 1 1 0 1 1 1 0 0 0 0 1 1 0 1 0 0 1 0 0 1 1 1 0 0 0 0 0 1 1 0
0 1 0 1 1 1 1 0 0 1 1 1 1 0 1 1 0 1 0 0 0 1 0 1 1 0 0 1 0 1 0 1 0 1 1 0 1 1 1 1 0 0 0 0 0 1 0 1 0 1 0 0 1 1 1 1 0 0 0 1 1 1 1 1 1
0 1 1 0 0 1 1 1 1 1 0 0 1 1 0 0 1 0 0 0 1 1 1 1 0 1 0 0 1 0 0 1 0 1 1 0 0 0 1 1 0 0 1 1 0 1 0 1 1 1 1 1 1 1 0 0 0 1 0 1 1 1 1 1 1
0 0 1 1 0 0 1 1 1 1 1 1 0 1 1 1 0 1 1 0 0 1 1 1 1 0 1 0 1 1 1 1 0 0 0 0 0 0 1 1 0 0 1 0 0 0 1 1 0 1 0 0 1 1 0 1 1 1 0 0 0 0 0 1 0
1 1 0 0 1 0 1 0 1 1 1 1 0 1 0 0 0 0 1 0 0 1 0 1 0 0 0 1 1 0 0 0 0 0 1 1 0 0 1 0 0 1 1 1 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 1 1 0 1 0 1
1 1 0 0 0 1 1 1 1 0 1 0 0 0 0 0 1 0 1 0 0 1 1 0 1 0 0 0 1 0 1 0 0 0 1 0 0 1 1 0 1 1 0 0 1 1 0 1 0 1 1 1 1 0 0 0 0 1 0 1 0 1 0 1 1
0 0 0 1 0 1 0 0 0 1 1 0 0 1 1 0 1 1 1 0 0 1 0 0 1 1 1 0 1 1 1 0 0 0 0 1 1 0 1 1 1 0 0 0 0 0 0 1 0 0 1 0 0 1 1 0 0 1 0 1 0 0 0 0 1
1 0 1 0 1 1 0 1 0 0 1 0 0 0 0 0 1 0 1 0 0 1 0 1 1 1 0 0 0 0 1 1 0 0 0 1 1 0 0 0 0 1 0 0 0 0 1 0 1 0 1 0 1 0 1 0 0 1 1 0 1 1 1 0 0
0 1 0 0 1 1 0 1 1 1 0 1 0 1 1 0 0 0 0 1 0 0 1 0 0 1 1 0 0 0 1 0 0 1 1 1 1 1 1 0 1 0 0 0 0 1 1 0 1 0 1 1 1 1 1 0 0 0 1 1 0 0 0 1 0
0 1 0 1 0 0 1 0 1 0 0 1 1 0 0 1 0 0 0 1 0 1 0 0 1 1 0 1 1 1 0 0 1 1 0 1 0 0 1 1 0 1 1 1 1 0 0 1 0 1 1 0 1 1 0 1 0 0 0 0 1 1 0 1 0
1 1 1 1 1 0 1 1 0 0 1 0 0 1 1 0 0 1 0 0 1 0 0 0 1 0 0 0 0 0 0 1 1 0 0 1 1 1 0 0 1 1 0 1 1 0 0 0 1 0 1 0 0 1 0 1 0 0 1 1 1 0 0 0 0
0 1 1 1 0 0 1 0 0 0 0 1 0 1 0 1 1 0 1 1 1 1 0 0 0 0 0 0 1 1 1 0 0 0 1 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 0 1 1 1 0 1 1
0 1 1 0 1 0 1 0 1 1 0 0 0 0 0 1 0 0 1 1 1 1 1 1 1 0 1 0 1 1 0 1 0 1 0 0 1 1 1 1 0 1 0 1 0 0 0 1 0 0 1 0 0 0 1 1 1 0 0 0 0 0 1 1 0
1 0 0 1 1 1 0 1 0 0 1 0 0 1 1 0 1 1 1 0 0 1 0 1 0 0 1 1 1 1 0 1 1 1 1 0 0 1 1 0 0 0 1 0 1 1 1 1 1 1 1 0 1 1 1 0 1 0 0 0 1 0 1 0 1
0 1 0 0 0 1 0 0 1 1 0 1 0 1 0 0 0 1 1 1 0 1 1 0 0 0 1 0 0 0 1 0 0 1 0 0 0 1 0 0 1 0 0 1 1 0 0 0 1 0 1 1 0 1 0 1 0 0 0 0 0 1 1 1 1
0 1 1 1 1 1 1 1 1 0 0 0 0 1 0 0 1 1 1 1 0 1 1 1 0 1 1 0 0 1 0 1 1 1 1 0 1 1 1 0 0 0 0 1 0 0 0 1 0 1 0 0 0 1 0 1 1 0 1 0 1 1 0 0 1
1 1 1 0 0 1 1 0 0 1 0 1 0 0 1 0 0 0 1 0 1 0 1 0 1 0 1 1 1 1 0 1 1 1 0 1 0 1 0 1 0 0 0 0 1 0 0 1 1 0 1 1 0 1 1 0 0 0 0 0 0 1 0 0 0
1 0 0 1 1 1 0 0 1 0 0 1 0 0 1 0 0 0 0 1 1 1 0 1 0 1 1 1 0 1 1 1 1 1 1 1 0 0 1 0 1 0 0 1 0 1 1 0 0 0 0 0 0 0 1 1 0 0 0 1 1 1 0 0 1
1 1 0 1 1 1 0 0 0 1 0 0 0 0 0 1 0 0 1 0 0 0 1 0 1 1 1 0 0 0 0 1 1 0 0 0 0 1 1 1 0 1 0 1 0 0 0 1 0 1 1 0 0 1 0 0 0 0 1 0 0 0 1 0 1
1 1 0 1 0 0 0 1 1 1 1 1 1 0 1 0 0 1 0 0 1 0 0 0 1 1 1 0 1 0 0 0 1 0 1 1 1 1 1 1 1 1 1 1 0 0 1 1 0 1 1 0 1 1 0 0 1 0 0 1 0 0 0 0 1
0 1 1 0 1 0 0 0 0 1 0 1 0 0 0 1 0 0 1 0 0 0 0 1 1 1 1 0 0 1 1 0 0 0 1 0 1 0 1 0 1 0 1 1 0 0 1 0 1 1 1 1 0 0 0 0 0 0 0 0 0 1 0 0 0
0 1 1 1 1 1 1 1 1 1 1 0 1 0 0 0 0 0 1 0 1 0 0 0 1 0 0 0 0 1 0 0 1 0 0 0 0 0 0 0 0 0 0 0 1 1 0 0 0 1 1 0 1 1 0 0 0 0 1 0 0 1 0 1 1
0 1 0 0 0 1 0 0 0 1 0 0 0 1 0 0 0 1 0 1 0 1 0 0 1 1 0 1 0 1 0 0 1 1 0 1 0 1 1 1 1 1 0 1 0 0 0 0 1 0 0 0 1 0 0 1 0 1 0 0 0 1 1 1 0
1 1 1 0 0 0 1 0 1 0 0 0 0 1 1 1 0 0 0 0 0 1 1 1 1 1 1 0 1 1 0 1 0 1 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 0 1 1 1 0 1 0 1 0 0 0 0 1 0 0 1
1 0 0 0 0 1 0 0 1 1 0 0 1 0 1 0 0 0 0 0 0 1 1 1 0 0 0 0 0 0 0 0 0 1 1 1 0 1 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 0 0 1 1 1 0 0 1 1 0 0
1 0 0 0 1 1 1 0 1 1 0 0 1 1 0 0 1 0 1 0 1 0 0 1 1 0 0 1 0 0 0 0 1 1 1 0 1 0 0 1 0 0 1 0 1 1 1 1 0 0 0 0 0 1 1 1 0 0 1 0 1 1 1 0 1

output: 21
 */