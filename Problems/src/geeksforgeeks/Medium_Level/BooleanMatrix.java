package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/boolean-matrix-problem-1587115620/1
public class BooleanMatrix {
    void booleanMatrix(int matrix[][])  {
        // code here
        // store all the i,j coordinates where we found 1 in matrix i -> R size 1-D array and j -> C size 1-D array
        // #Rows - matrix.length and #Columns - matrix[0].length
        // Traverse once again, if stored (i,j) coordinates present 1 then make that element as 1

        int r = matrix.length;
        int c = matrix[0].length;
        int[] row = new int[r];
        int[] col = new int[c];

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(matrix[i][j] == 1) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }

    }
}
/*
Given a boolean matrix of size RxC where each cell contains either 0 or 1, modify it such that if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.

Example 1:

Input:
R = 2, C = 2
matrix[][] = {{1, 0},
              {0, 0}}
Output:
1 1
1 0
Explanation:
Only cell that has 1 is at (0,0) so all
cells in row 0 are modified to 1 and all
cells in column 0 are modified to 1.

Example 2:

Input:
R = 4, C = 3
matrix[][] = {{ 1, 0, 0},
              { 1, 0, 0},
              { 1, 0, 0},
              { 0, 0, 0}}
Output:
1 1 1
1 1 1
1 1 1
1 0 0
Explanation:
The position of cells that have 1 in
the original matrix are (0,0), (1,0)
and (2,0). Therefore, all cells in row
0,1,2 are and column 0 are modified to 1.
Your Task:
You dont need to read input or print anything. Complete the function booleanMatrix() that takes the matrix as input parameter and modifies it in-place.

Expected Time Complexity: O(R * C)
Expected Auxiliary Space: O(R + C)
 */
