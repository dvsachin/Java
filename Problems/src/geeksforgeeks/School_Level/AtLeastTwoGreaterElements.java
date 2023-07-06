package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AtLeastTwoGreaterElements {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            long n = Integer.parseInt(read.readLine().trim());
            long[] a = new long[(int) n];

            String[] inputLine = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Long.parseLong(inputLine[i]);

            long[] res = new AtLeastTwoGreaterElements().findElements(a, n);
            for (int i = 0; i < res.length; i++)
                System.out.print(res[i] + " ");

        }
    }

    public long[] findElements(long a[], long n) {
        // Your code goes here
        Arrays.sort(a);
        long[] res = new long[a.length-2];

        for(int i=0; i<n-2; i++)
            res[i] = a[i];

        return res;
    }
}

/*
Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.


Example 1:

Input :
a[] = {2, 8, 7, 1, 5}
Output :
1 2 5
Explanation :
The output three elements have two or
more greater elements.
Example 2:

Input :
a[] = {7, -2, 3, 4, 9, -1}
Output :
-2 -1 3 4

Your Task:
You don't need to read input or print anything. Your task is to complete the function findElements() which takes the array A[] and its size N as inputs and return the vector sorted values denoting the elements in array which have at-least two greater elements than themselves.

Expected Time Complexity: O(N*Log(N))
Expected Auxiliary Space: O(N)

Constraints:
3 ≤ N ≤ 105
-106 ≤ Ai ≤ 106
 */