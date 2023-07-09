package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallerAndLarger {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int countLess =0, countMore=0;

        for (int i=0; i<n; i++){
            if(arr[i] > x) countMore++;
            else if(arr[i] < x) countLess++;
            else {
                countLess++;
                countMore++;
            }
        }
        return new int[]{countLess,countMore};

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] inputLine  = read.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);

            int[] a = new int[n];
            inputLine = read.readLine().trim().split(" ");
            for (int i=0;i<n;i++)
                a[i] = Integer.parseInt(inputLine[i]);

            int[] ans = new SmallerAndLarger().getMoreAndLess(a,n,x);
            System.out.println(ans[0]+" "+ans[1]);

        }
    }
}
/*
Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X.

Example 1:

Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0.
Example 2:

Input:
N = 7, X = 5
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 2 5
Explanation: There are 2 elements less or
equal to 5 and 5 elements greater or equal
to 5.
Your Task:
You don't need to read input or print anything. Your task is to complete the function getMoreAndLess() which takes the array of integers arr, n and x as parameters and returns an array of size 2. pair denoting the answer. The first value is number of elements less than or equal to x and the second value is number of elements more than or equal to x.

Expected Time Complexity: O(logN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
0 ≤ X ≤ 106
1 ≤ Arr[i] ≤ 106
 */