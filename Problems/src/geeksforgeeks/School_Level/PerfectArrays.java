package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int[] arr = new int[N];

            String line = read.readLine();
            String[] elements = line.trim().split(" ");

            for(int i=0; i<N; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }
            PerfectArrays pa = new PerfectArrays();

            if(pa.IsPerfect(arr,N)) System.out.println("PERFECT");
            else System.out.println("NOT PERFECT");

        }
    }

    public boolean IsPerfect(int a[], int n) {
        // Complete the function
        boolean flag = true;
        for(int i =0, j=n-1 ; i<j ; i++, j--) {
            if(!(a[i] == a[j])) {
                flag = false;
                break;
            }
        }
        return flag;

    }

}
/*
Given an array of size N and you have to tell whether the array is perfect or not. An array is said to be perfect if its reverse array matches the original array. If the array is perfect then return True else return False.

Example 1:

Input : Arr[] = {1, 2, 3, 2, 1}
Output : PERFECT
Explanation:
Here we can see we have [1, 2, 3, 2, 1]
if we reverse it we can find [1, 2, 3, 2, 1]
which is the same as before.
So, the answer is PERFECT.

Example 2:

Input : Arr[] = {1, 2, 3, 4, 5}
Output : NOT PERFECT

User Task:
The task is to complete the function IsPerfect(), which takes an array (a), size of the array (n), and returns the boolean value true if it is Perfect else false. The driver will print itself "PERFECT" or "NOT PERFECT" accordingly.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 2 * 105
1 ≤ ai ≤ 103
 */