package geeksforgeeks.Medium_Level;

public class MakeMatrixBeautiful {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int matrixSum = 0;
        int maxRowSum = 0;
        int maxColSum = 0;
        int maxRowOrColValue = 0;
        int ans = 0;

        // get total matrix sum
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                matrixSum = matrixSum + matrix[i][j];
            }
        }

        for(int i=0; i<N; i++) {
            int currRowSum = 0;
            for(int j=0; j<N; j++) {
                currRowSum = currRowSum + matrix[i][j];
            }
            // get max of currRowSum and maxRowSum
            maxRowSum = Math.max(currRowSum,maxRowSum);

            int currColSum = 0;
            for(int j=0; j<N; j++) {
                currColSum = currColSum + matrix[j][i];
            }
            // get max of currColSum and maxColSum
            maxColSum = Math.max(currColSum,maxColSum);
        }
        // get max of ColumnsMax and RowMax

        maxRowOrColValue = Math.max(maxRowSum,maxColSum);

        // max of ColumnsMax and RowMax * Number of R|C - total matrix sum
        ans = maxRowOrColValue*N - matrixSum;

        return ans;

    }
}

/*
https://practice.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1


A beautiful matrix is a matrix in which the sum of elements in each row and column is equal. Given a square matrix of size NxN. Find the minimum number of operation(s) that are required to make the matrix beautiful. In one operation you can increment the value of any one cell by 1.
Example 1:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output:
4
Explanation:
Updated matrix:
4 3
3 4
1. Increment value of cell(0, 0) by 3
2. Increment value of cell(0, 1) by 1
Hence total 4 operation are required.
Example 2:

Input:
N = 3
matrix[][] = {{1, 2, 3},
              {4, 2, 3},
              {3, 2, 1}}
Output:
6
Explanation:
Number of operations applied on each cell are as follows:
1 2 0
0 0 0
0 1 2
Such that all rows and columns have sum of 9.
Your Task:
You don't need to read input or print anything. Complete the function findMinOpeartion() that takes matrix and n as input parameters and returns the minimum number of operations.

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(N)

 */