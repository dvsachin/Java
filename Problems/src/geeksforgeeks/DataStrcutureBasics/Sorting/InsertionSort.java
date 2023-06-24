package geeksforgeeks.DataStrcutureBasics.Sorting;

import java.util.Scanner;

public class InsertionSort {
    static void insert(int arr[],int i) {
        // Your code here
        int j=i-1;
        int key = arr[i];

        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;

    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        //code here
        for(int i=1;i<n;i++){
            insert(arr, i);
        }

        for (int x : arr)
            System.out.print(x+" ");
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t -- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++)
                arr[i] = sc.nextInt();

            new InsertionSort().insertionSort(arr,n);

        }

    }
}
