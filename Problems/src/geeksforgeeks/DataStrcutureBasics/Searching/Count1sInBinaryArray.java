package geeksforgeeks.DataStrcutureBasics.Searching;

import geeksforgeeks.DataStrcutureBasics.Recursion.CountTotalDigitsInANumber;

import java.util.Scanner;

public class Count1sInBinaryArray {
    public static int countOnes(int arr[], int N){

        // Your code here
        int low = 0, high = N - 1;

        if(arr[N-1] == 1) return N;

        if(N == 1)
            if(arr[0] == 1)
                return 1;
            else
                return 0;


        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == 1 && arr[mid+1] == 0 )
                return mid+1;

            else if(arr[mid] == 0)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return 0;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            System.out.println(new Count1sInBinaryArray().countOnes(arr,n));
        }
    }
}
