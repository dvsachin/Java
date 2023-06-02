package geeksforgeeks;

import java.util.Properties;
import java.util.Scanner;

public class MaximumAndMinimumInArray {
    public static int maximumElement(int arr[],int n) {
        // Your code here
        int max = arr[0];

        for(int i=1; i< n; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static int minimumElement(int arr[],int n) {
        // YOUR code here
        int min = arr[0];

        for(int i=1; i< n; i++) {
            if(arr[i] < min) min = arr[i];
        }
        return min;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n;i++)
                arr[i] = scanner.nextInt();


            MaximumAndMinimumInArray w = new MaximumAndMinimumInArray();
            System.out.println(w.maximumElement(arr,n)+" "+w.minimumElement(arr,n));
        }
    }
}
