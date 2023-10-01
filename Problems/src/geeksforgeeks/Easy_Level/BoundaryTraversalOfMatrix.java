package geeksforgeeks.Easy_Level;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/1
public class BoundaryTraversalOfMatrix {
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        // n -> Rows, m -> Columns
        for (int i=0; i<m; i++)  // ROW = top -> left to right
            ans.add(matrix[0][i]);

        for (int i=1; i<n; i++) // COLUMN = top-right -> top to bottom
            ans.add(matrix[i][m-1]);

        // to stop add repeated elements if numbers of rows or columns = 1 (given 1-D array)
        if(n>1) { // skip if there is no bottom row
            for (int i = m - 2; i >= 0; i--)  // ROW =  bottom-right -> right to left
                ans.add(matrix[n - 1][i]);
        }
        if(m>1) { // skip if there is no 2nd column
            for (int i = n - 2; i > 0; i--)  // COLUMN = left-bottom -> bottom to top
                ans.add(matrix[i][0]);
        }
        return ans;
    }
}
/*
You are given a matrix of dimensions n x m. The task is to perform boundary traversal on the matrix in a clockwise manner.

Example 1:

Input:
n = 4, m = 4
matrix[][] = {{1, 2, 3, 4},
         {5, 6, 7, 8},
         {9, 10, 11, 12},
         {13, 14, 15,16}}
Output: 1 2 3 4 8 12 16 15 14 13 9 5
Explanation:
The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is:
1 2 3 4 8 12 16 15 14 13 9 5
Example 2:

Input:
n = 3, m = 4
matrrix[][] = {{12, 11, 10, 9},
         {8, 7, 6, 5},
         {4, 3, 2, 1}}
Output: 12 11 10 9 5 1 2 3 4 8
Your Task:
Complete the function boundaryTraversal() that takes matrix, n and m as input parameters and returns the list of integers that form the boundary traversal of the matrix in a clockwise manner.

Expected Time Complexity: O(N + M)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n, m<= 1000
0 <= matrixi <= 1000

 */
