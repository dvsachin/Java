package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class MeanAndMedianOfArray {
    //Function to find median of the array elements.
    public int median(int A[],int N) {
        int midValue = 0;
        Arrays.sort(A);

        //Your code here
        if(N%2==0) { // Even
            midValue = (int) Math.floor( ( A[(N/2)-1] + A[(N/2)] )/2 );
        }
        else { // Odd
            midValue = A[(int) Math.floor(N/2)];
        }

        //If median is fraction then convert it to integer and return
        return midValue;
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N) {
        //Your code here
        int meanValue = 0, sum = 0;

        for(int i=0; i<N; i++){
            sum = sum + A[i];
        }
        meanValue = (int) Math.floor(sum / N);

        return meanValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }

            MeanAndMedianOfArray mm = new MeanAndMedianOfArray();
            System.out.println(mm.mean(a,n)+" "+mm.median(a,n));
        }
    }
}

/*
Given an array a[ ] of size N. The task is to find the median and mean of the array elements. Mean is average of the numbers and median is the element which is smaller than half of the elements and greater than remaining half.  If there are odd elements, the median is simply the middle element in the sorted array. If there are even elements, then the median is floor of average of two middle numbers in the sorted array. If mean is floating point number, then we need to print floor of it.

Note: To find the median, you might need to sort the array. Since sorting is covered in later tracks, we have already provided the sort function to you in the code.

Example 1:

Input:
N = 5
a[] = {1, 2, 19, 28, 5}
Output: 11 5
Explanation: For array of 5 elements,
mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
Median is 5 (middle element after
sorting)
Example 2:

Input:
N = 4
a[] = {2, 8, 3, 4}
Output: 4 3
Explanation: For array of 4 elements,
mean is floor((2 + 8 + 3 + 4)/4) = 4.
Median is floor((4 + 3)/2) = 3
Your Task:
You don't need to read input or print anything.. You just need to complete the following two function:

mean(): It takes the array and its size N as parameters and returns the mean as an integer.
median(): It takes the array and its size N as parameters and returns the median as an integer.
Expected Time Complexity: O(N log(N)).
Expected Auxiliary Space: O(1).
 */