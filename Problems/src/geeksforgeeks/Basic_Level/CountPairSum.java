package geeksforgeeks.Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CountPairSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-- > 0) {
            String line1 = reader.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int m = Integer.parseInt(a1[0]);
            int n  = Integer.parseInt(a1[1]);

            String line2 = reader.readLine();
            String[] a2 = line2.trim().split("\\s+");
            int[] a = new int[m];
            for (int i=0;i<m;i++) {
                a[i] = Integer.parseInt(a2[i]);
            }

            String line3 = reader.readLine();
            String[] a3 = line3.trim().split("\\s+");
            int[] b = new int[n];
            for (int i=0;i<n;i++) {
                b[i] = Integer.parseInt(a3[i]);
            }

            int x = Integer.parseInt(reader.readLine());
            System.out.println(new CountPairSum().countPairs(a,b,m,n,x));
        }
    }


    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[],int arr2[], int M, int N, int x)  {
        //code here.
        int count = 0;
        for(int i=0; i<M;i++) {
            int value = x - arr1[i];
            if(Arrays.binarySearch(arr2, value) >= 0) count++;
//            if(IntStream.of(arr2).anyMatch(z -> z == value)) count++;
        }

        return count;
    }
}

/*
Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements. Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.


Example 1:

Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).


Example 2:

Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0


Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countPairs() that takes array arr1, array arr2, integer M, integer N and integer x as parameters and return the count of all pairs from both arrays whose sum is equal to x.



Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).



Constraints:
1 ≤ M, N ≤ 105


 */