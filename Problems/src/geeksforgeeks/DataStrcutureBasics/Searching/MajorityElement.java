package geeksforgeeks.DataStrcutureBasics.Searching;

import java.util.Scanner;
//  Moore's Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++)
                arr[i] = sc.nextInt();

            System.out.println(new MajorityElement().majorityElement(arr,n));
        }
    }
    static int majorityElement(int a[], int size) {
        // your code here
        int majElement = size/2, count = 0, element = 0;

        for (int i=0;i<size;i++) {
            if(count == 0)
                element = a[i];
            if(a[i] == element)
                count++;
            else
                count--;
        }

        // found the element, now find the actual count
        count = 0;
        for(int i=0;i<size;i++) {
            if(element == a[i]) count++;
        }

        // verify actual count element is majority or not
        if(count > majElement)
            return element;
        else
            return -1;

    }
}
/*
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times in the array.


Example 1:

Input:
N = 3
A[] = {1,2,3}
Output:
-1
Explanation:
Since, each element in
{1,2,3} appears only once so there
is no majority element.
Example 2:

Input:
N = 5
A[] = {3,1,3,3,2}
Output:
3
Explanation:
Since, 3 is present more
than N/2 times, so it is
the majority element.

Your Task:
The task is to complete the function majorityElement() which returns the majority element in the array. If no majority exists, return -1.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1 ≤ N ≤ 107
0 ≤ Ai ≤ 106


 */
