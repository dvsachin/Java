package geeksforgeeks.Easy_Level;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
public class PrintMatrixInSnakePattern {
    static ArrayList<Integer> snakePattern(int mat[][]) {
        // code here
        int n = mat.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((i&1)==0) list.add(mat[i][j]);
                else list.add(mat[i][n-1-j]);
            }
        }
        return list;
    }
}
/*
Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.


Example 1:

Input:
N = 3
matrix[][] = {{45, 48, 54},
             {21, 89, 87}
             {70, 78, 15}}
Output:
45 48 54 87 89 21 70 78 15
Explanation:
Matrix is as below:
45 48 54
21 89 87
70 78 15
Printing it in snake pattern will lead to
the output as 45 48 54 87 89 21 70 78 15.
Example 2:

Input:
N = 2
matrix[][] = {{1, 2},
              {3, 4}}
Output:
1 2 4 3
Explanation:
Matrix is as below:
1 2
3 4
Printing it in snake pattern will
give output as 1 2 4 3.
Your Task:
You dont need to read input or print anything. Complete the function snakePattern() that takes matrix as input parameter and returns a list of integers in order of the values visited in the snake pattern.

Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(N * N) for the resultant list only.

Constraints:
1 <= N <= 103
1 <= mat[i][j] <= 109
 */