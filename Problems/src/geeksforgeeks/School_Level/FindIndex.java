package geeksforgeeks.School_Level;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int key = sc.nextInt();
            int[] res = new FindIndex().findIndex(a,n,key);

            System.out.println(res[0]+" "+res[1]);
        }
    }
    static int[] findIndex(int a[], int N, int key)  {
        //code here.
        int startIndex = -1;
        int endIndex = -1;

        for(int i=0; i<N; i++) {
            if(a[i] == key) {
                startIndex = i;
                break;
            }
        }

        for(int i=N-1; i>=0; i--) {
            if(a[i] == key ) {
                endIndex = i;
                break;
            }
        }

        return new int[] {startIndex, endIndex};
    }
}

/*
Given an unsorted array Arr[] of N integers and a Key which is present in this array. You need to write a program to find the start index( index where the element is first found from left in the array ) and end index( index where the element is first found from right in the array ).If the key does not exist in the array then return -1 for both start and end index in this case.

Example 1:

Input:
N = 6
arr[] = { 1, 2, 3, 4, 5, 5 }
Key = 5
Output:  4 5
Explanation:
5 appears first time at index 4 and
appears last time at index 5.
(0 based indexing)


Example 2:

Input:
N=6
arr[] = { 6, 5, 4, 3, 1, 2 }
Key = 4
Output:  2 2

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function findIndex() that takes array a, integer N and integer key as parameters and returns an array of length 2 in which at first index contains the value of start index and at the second index contains the value of end index. If the key does not exist in the array then return -1 for both start and end index in this case.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 106


 */