package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ArrayIsSorted {
    public static int isSorted(int arr[], int n) {
        /// Your code here
        int flag = 0;
        boolean inc = true, dec = true;


        for(int i = 1; i<n; i++) { // increasing order
            if(arr[i-1] > arr[i])  inc = false;
        }

        for(int i = 1; i<n; i++) { // decreasing order
            if(arr[i-1] < arr[i])  dec = false;
        }

        if(inc || dec) flag = 1;

        return flag;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n  = Integer.parseInt(read.readLine());
            int[] arr = new int[n];

            String[] str = read.readLine().trim().split(" ");
            for (int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            System.out.println(new ArrayIsSorted().isSorted(arr,n));
        }

    }
}
