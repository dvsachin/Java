package geeksforgeeks;

import java.util.Scanner;

public class FindDistinctElements {
    static int distinct(int arr[], int n) {
        // code here
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            count++;
            for(int j = 0; j <= i; j++) {
                if(arr[i] == arr[j] && i != j) {
                    count--;
                    break;
                }

            }


        }
        return count;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i =0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(distinct(arr,size));
    }
}
/*
Given an array arr[] of size n, find count of all the distinct elements in an array

Example 1:

Input:
n = 4
arr = {2, 2, 3, 2}
Output:
2
Example 2:

Input:
n = 5
arr = {12, 1, 14, 3, 16}
Output:
5

Input:
n = 14
arr = 14
-100 -1000 34 34 44 44 44 65 77 77 77 1000 1000 1000
output: 7

Your Task:
You do not need to read input or print anything. Your task is to complete the function distinct() which takes the array arr and n as input parameters and returns the number of distinct elements in the array.

Constraints:
1 ≤ n ≤ 100
-1000 ≤ arr[i] ≤ 1000
 */