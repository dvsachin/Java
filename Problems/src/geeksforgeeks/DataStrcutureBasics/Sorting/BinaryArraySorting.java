package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryArraySorting {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            String[] inputLine = read.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = read.readLine().trim().split(" ");

            for (int i =0; i<n; i++)
                arr[i] = Integer.parseInt(inputLine[i]);


            new BinaryArraySorting().binSort(arr,n);

            for (int i =0; i<n; i++)
                System.out.print(arr[i]+" ");

        }
    }
    static void binSort(int A[], int N) {
        // add your code here
        int countOnes = 0;

        for (int i=0; i<N; i++) {
            if(A[i] == 1) countOnes++;
            A[i] = 0;
        }

        for (int i=N-1; countOnes > 0 ; i--) {
            A[i] = 1;
            countOnes--;
        }

    }
}
