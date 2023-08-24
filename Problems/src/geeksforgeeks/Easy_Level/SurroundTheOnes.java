package geeksforgeeks.Easy_Level;

public class SurroundTheOnes {
    public int  Count(int[][] matrix) {
        // code here
        int ans = 0, countZeros = 0, nr = 0, nc = 0;
        int n = matrix.length, m = matrix[0].length;

        int r[] = {-1,-1,0,1,1,1,0,-1};
        int c[] = {0,1,1,1,0,-1,-1,-1};

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 1) {
                    countZeros = 0;

                    for(int k=0; k<8; k++) {
                        nr = i + r[k];
                        nc = j + c[k];

                        if(nr >= 0 && nr < n && nc >= 0 && nc < m && matrix[nr][nc] == 0)
                            countZeros++;
                    }
                    if(countZeros > 0 && countZeros %2 == 0)
                        ans++;
                }
            }
        }

        return ans;

    }
}

/*
https://practice.geeksforgeeks.org/problems/surround-the-1s2505/1


Given a matrix of order nxm, composed of only 0's and 1's, find the number of 1's in the matrix that are surrounded by an even number (>0) of 0's. The surrounding of a cell in the matrix is defined as the elements above, below, on left, on right as well as the 4 diagonal elements around the cell of the matrix. Hence, the surrounding of any matrix elements is composed of 8 elements. Find the number of such 1's.

Example 1:

Input:
matrix = {{1, 0, 0},
          {1, 1, 0},
          {0, 1, 0}}
Output:
1
Explanation:
1 that occurs in the 1st row and 1st column, has 3 surrounding elements 0,1 and 1. The occurrence of zero is odd.
1 that occurs in 2nd row and 1st column has 5 surrounding elements 1,0,1,1 and 0. The occurrence of zero is even.
1 that occurs in 2nd row and 2nd column has 8 surrounding elements. The occurrence of 0 is odd.
Similarly, for the 1 that occurs in 3rd row and 2nd column, the occurrence of zero in it's 5 surrounding elements is odd.
Hence, the output is 1.
Example 2:

Input:
matrix = {{1}}
Output:
0
Explanation:
There is only 1 element in the matrix. Hence, it has no surroundings, so it's count for even 0's is 0 for the whole matrix.
0 is even but we want occurrence of a zero in the surrounding at least once.
Hence, output is 0.
Your Task:
You don't need to read or print anything. Your task is to complete the function Count() which takes the matrix as input parameter and returns the number of 1's which are surrounded by even number of 0's.

Expected Time Complexity: O(n * m)
 */
