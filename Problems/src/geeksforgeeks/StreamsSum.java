package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class StreamsSum {
    public static int sumUsingStreams(int[] arr) {
        //Your code here
        //use stream.sum()
        int sum = Arrays.stream(arr).sum();

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(sumUsingStreams(arr));
        }
    }
}
/*
Given an array arr[] of size N containing integers. The task is to find the sum of the array using streams.

Example 1 :

Input:
4
1 2 3 4

Output:
10

Explanation:
1+2+3+4 = 10
Example 2 :

Input:
3
3 2 1

Output:
6

Explanation:
3+2+1 = 6
User Task:
You need to complete the function sumUsingStreams that takes arr as argument and returns the sum
 */