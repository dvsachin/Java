package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class RotateArray {
    static void rotateArr(int arr[], int d, int n) { //  approach-1 // time complexity O(n) and use auxiliary space 𝛳(d)
        // add your code here
        int[] temp = new int[d];

        for(int i=0; i<d;i++) { // copy first d elements to temp array
            temp[i] = arr[i];
        }
        for (int i=d; i<n;i++) { // shift n-d elements to the left
            arr[i-d] = arr[i];
        }
        for(int i=0; i<d; i++) { // put elements to the right from temp array
            arr[n - d + i] = temp[i];
        }
        
    }
    static void rotateArr(int arr[], int d) { //  approach-2 // time complexity O(n) and use auxiliary space 𝛳(1)
        // ex: i/p= 1,2,3,4,5 and d = 2

        // add your code here
        int n = arr.length;

        d = d % n; // if d is greater than equal to n

        // first reverse d (1,2) => (2,1) = reverse 0 to d-1 elements
        reverseArr(arr, 0,d-1);

       // second reverse n-d  (3,4,5) => (5,4,3) = reverse d to n-1 elements
        reverseArr(arr, d,n-1);

       // 2,1,5,4,3, now reverse the whole array => (3,4,5,1,2) = reverse 0 to n-1 elements
        reverseArr(arr, 0,n-1);

    }
    static void reverseArr(int[] arr, int min,int max) {
        int temp =0;
        while (min < max) {
            // swap
            temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;

            min++;
            max--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        for(int i=0;i<t;i++) {

            String str = read.readLine();
            String[] starr =  str.split(" ");

            int n = Integer.parseInt(starr[0]);
            int d = Integer.parseInt(starr[1]);

            int[] arr = new int[n];
            String str1 = read.readLine();
            String[] starr1 = str1.split(" ");

            for(int j=0; j<n;j++) {
                arr[j] = Integer.parseInt(starr1[j]);
            }

            RotateArray ra  = new RotateArray();
            ra.rotateArr(arr,d,n); //  approach-1 // time complexity O(n) and use auxiliary space 𝛳(d)
//            ra.rotateArr(arr,d); // approach-2 // time complexity O(n) and use auxiliary space 𝛳(1)
            StringBuffer sb = new StringBuffer();

            for(int t1=0; t1<n;t1++) {
                sb.append(arr[t1]+" ");
            }

            out.println(sb);
        }
        out.close();
    }
}

/*
Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction) by D steps, where D is a positive integer.



Example 1:

Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
Example 2:

Input:
N = 10, D = 3
arr[] = {2,4,6,8,10,12,14,16,18,20}
Output: 8 10 12 14 16 18 20 2 4 6
Explanation: 2 4 6 8 10 12 14 16 18 20
when rotated by 3 elements, it becomes
8 10 12 14 16 18 20 2 4 6.


Your Task:
Complete the function rotateArr() which takes the array, D and N as input parameters and rotates the array by D elements. The array must be modified in-place without using extra space.



Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 10^6
1 <= D <= 10^6
0 <= arr[i] <= 10^5
 */

/*
Complex inputs
For Input:
47 77
25 6 20 55 69 5 50 63 61 41 87 80 2 96 77 70 12 43 31 8 64 41 68 18 95 79 52 74 1 98 3 26 3 74 32 23 79 81 37 39 21 24 18 22 71 47 44

Correct output is:
3 26 3 74 32 23 79 81 37 39 21 24 18 22 71 47 44 25 6 20 55 69 5 50 63 61 41 87 80 2 96 77 70 12 43 31 8 64 41 68 18 95 79 52 74 1 98


For Input:
77 69
40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25


It's Correct output is:
29 42 51 94 1 35 65 25 40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65
 */