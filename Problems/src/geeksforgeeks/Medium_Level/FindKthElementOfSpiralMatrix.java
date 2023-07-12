package geeksforgeeks.Medium_Level;

import geeksforgeeks.Basic_Level.FindTripletsWithZeroSum;

import java.io.PrintWriter;
import java.util.Scanner;

public class FindKthElementOfSpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-->0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] arr = new int[1000][1000];
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            System.out.println(new FindKthElementOfSpiralMatrix().findK(arr,n,m,k));
        }
    }
    int findK(int A[][], int n, int m, int k) {
        // Your code here
        int left = 0, right = m-1, top = 0, bottom = n-1;
        int count = 1;

       while (top <= bottom && left <= right) {
           for (int i=left; i<=right; i++) {
               if(count == k) return A[top][i];
               else count++;
           }
           top++;

           for (int i=top; i<=bottom; i++) {
               if(count == k) return A[i][right];
               else count++;
           }
           right--;

           if(top <= bottom) {
               for (int i = right; i>=left; i--) {
                   if(count == k) return A[bottom][i];
                   else count++;
               }
               bottom--;
           }


           if(left <= right) {
               for (int i = bottom; i>=top; i--) {
                   if(count == k) return A[i][left];
                   else count++;
               }
               left++;
           }
       }
       return 0;
    }
}

/*
Given a matrix with n rows and m columns. Your task is to find the kth element which is obtained while traversing the matrix spirally. You need to complete the method findK which takes four arguments the first argument is the matrix A and the next two arguments will be n and m denoting the size of the matrix A and then the forth argument is an integer k. The function will return the kth element obtained while traversing the matrix spirally.

Example 1:

Input:
n = 4, m = 4, k = 10
A[][] = {{1  2  3  4},
         {5  6  7  8},
         {9  10 11 12},
         {13 14 15 16}}
Output:
13
Explanation:

The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13.
Example 2:

Input:
n = 3, m = 3, k = 4
A[][] = {{1 2 3},
         {4 5 6},
         {7 8 9}}
Output:
6
Explanation:
The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
Your Task:
You only need to implement the given function findK(). Do not read input, instead use the arguments given in the function. Return the K'th element obtained by traversing matrix spirally.

Expected Time Complexity: O(n*m)
Expected Auxiliary Space: O(n*m)

Constraints:
1<=n,m<=103
1<=k<=n*m
-109 <= A[i][j] <= 109


 */