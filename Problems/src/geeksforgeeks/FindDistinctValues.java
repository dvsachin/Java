package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class FindDistinctValues {
    public static int distinct(int M[][], int N) {
        int[] elements = new int[N];
        int count = 1, output = 0;
        boolean flag = true, rowFlag = true;

        elements[0] = M[0][0];
        for(int i=1; i<N; i++) {
            rowFlag = true;
            int value = M[0][i];
            for(int j=0; j<N; j++) {
                if(value == elements[j]) rowFlag = false;
            }
            if(rowFlag) elements[i] = M[0][i];
        }

        for(int i=0; i<N; i++) {
            for(int j=1; j<N; j++) {
                for(int k=0; k<N; k++) {
                    if(elements[i] == M[j][k]) {
                        count++;
                        flag = false;
                        break;
                    }
                }
                if(flag) break;
            }
            if(count == N)
                output++;

            count = 1;


        }
        return output;

    }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
// size = 5
//12 1 14 3 16 14 2 1 3 35 14 1 14 3 11 14 25 3 2 1 1 18 3 21 14
// output: 3

//  4
// 2 1 4 3 1 2 3 2 3 6 2 3 5 2 5 3
// output: 2

// 4
// 1 2 1 2 2 2 2 1 2 1 2 2 2 1 1 1
// output: 2

// 18
// 5 1 6 6 1 7 1 6 6 8 7 1 8 5 2 9 9 4
// 9 4 7 8 1 4 6 2 6 9 5 4 5 7 4 1 3 4
// 5 1 8 9 8 3 7 6 8 8 6 5 1 5 6 7 3 6
// 8 7 7 4 6 1 5 8 7 9 6 8 1 2 8 6 1 7
// 9 7 1 5 3 4 9 1 9 3 7 9 8 3 6 4 4 1
// 4 9 6 8 8 3 6 6 2 3 3 2 7 2 6 7 4 6
// 2 3 7 8 3 2 5 1 5 2 2 6 9 3 5 5 9 1
// 5 5 7 6 5 7 5 2 8 8 7 2 5 6 2 9 4 4
// 8 8 2 1 7 2 7 4 4 9 9 1 1 4 6 5 8 8
// 2 3 1 7 2 5 6 4 1 5 1 2 6 8 7 5 9 5
// 6 6 6 8 3 5 8 3 7 2 5 5 1 4 5 8 1 6
// 1 4 7 1 8 7 9 4 6 6 9 3 8 5 6 5 1 8
// 7 9 9 2 8 4 6 8 6 9 4 6 3 4 8 1 2 6
// 5 1 1 8 5 7 1 1 9 4 5 1 3 1 7 2 2 5
// 3 6 2 8 5 3 3 5 7 1 5 8 6 1 7 4 6 2
// 8 7 9 8 1 3 6 1 3 3 2 2 5 3 5 4 1 7
// 7 3 3 2 1 7 7 7 5 4 8 2 3 7 6 3 3 4
// 5 8 5 5 8 4 6 1 4 2 5 5 8 9 5 1 1 6

// output: 1 (8)
            int[][] arr = new int[size][size];

            for(int i =0; i<arr.length; i++) {
                for (int j = 0; j< arr.length; j++) {
                    arr[i][j] = scanner.nextInt();
                }

            }

            System.out.println(distinct(arr,size));
        }
}

/*
Given a N x N matrix M. Write a program to find count of all the distinct elements common to all rows of the matrix. Print count of such elements.

Example 1:

Input:
N = 4
M = {{2, 1, 4, 3},
     {1, 2, 3, 2},
     {3, 6, 2, 3},
     {5, 2, 5, 3}}
Output:
2
Explanation: Only 2 and 3 are common in all rows.
Example 2:

Input:
N = 5
M = {{12, 1, 14, 3, 16},
     {14, 2, 1, 3, 35},
     {14, 1, 14, 3, 11},
     {14, 5, 3, 2, 1},
     {1, 18, 3, 21, 14}}
Output:
3
Explaination: 14, 3 and 1 are common in all the rows.
Your Task:
You do not need to read input or print anything. Your task is to complete the function distinct() which takes the matrix and n as input parameters and returns the number of distinct elements present in every row.

Expected Time Complexity: O(N*N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 100
1 ≤ M[i][j] ≤ 1000
 */