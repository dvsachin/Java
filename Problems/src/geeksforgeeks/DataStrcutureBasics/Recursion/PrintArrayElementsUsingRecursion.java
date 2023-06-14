package geeksforgeeks.DataStrcutureBasics.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintArrayElementsUsingRecursion {
    // Complete the function
    // arr[]: input array
    // n: size of inout array
    public static void printArrayRecursively(int arr[], int n) {
        // Print
        if(n == 0) return;
        else {
            printArrayRecursively(arr, n - 1);
            System.out.print(arr[n-1]+" ");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
           int n = Integer.parseInt(read.readLine());
           int[] arr = new int[n];

           String[] str = read.readLine().trim().split(" ");

           for(int i = 0; i < n; i++) {
               arr[i] = Integer.parseInt(str[i]);
           }

            new PrintArrayElementsUsingRecursion().printArrayRecursively(arr,n);
        }

    }
}
