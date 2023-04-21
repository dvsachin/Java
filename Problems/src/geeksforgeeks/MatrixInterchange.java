package geeksforgeeks;

public class MatrixInterchange {
    static void interchange(int a[][],int r, int c){

        // Your code here
        for(int i = 0; i<r; i++) {
                int temp = a[i][0];
                a[i][0] = a[i][c-1];
                a[i][c-1] = temp;
        }

        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] multiArray = {{1,2,3,4},{4,3,2,1},{6,7,8,9}};
        interchange(multiArray,3,4);

    }
}
/*
Here we will do swapping of column in a 2D array. You are given a matrix M or r rows and c columns. You need to swap the first column with the last column.

Example:

Input:
3 4
1 2 3 4
4 3 2 1
6 7 8 9

Output:
4 2 3 1
1 3 2 4
9 7 8 6
Your Task:
Since this is a function problem, you don't need to take any input. Just complete the provided function interchange(int, int , int ) that take matrix, rows and columns as parameters.

Constraints:
1 <= r,c <= 100
 */