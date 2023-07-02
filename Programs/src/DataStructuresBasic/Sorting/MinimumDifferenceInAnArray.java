package DataStructuresBasic.Sorting;

import java.util.Arrays;
import java.util.Scanner;
// TC = Naive = Theta(n^2)
// TC = Efficient = O(n*log n)

public class MinimumDifferenceInAnArray {
    int getMinDiffNaive(int arr[], int n){
        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            for(int j = 0;j < i;j++){
                res = Math.min(res, Math.abs(arr[i] - arr[j]));
            }
        }
        return res;
    }

    int getMinDiffEfficient(int arr[], int n){
        // Sort the array
        // traverse the sorted array and get min difference of adjacent elements
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            res = Math.min(res, arr[i] - arr[i-1]);
            // subtract the previous from current element
        }
        return res;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();


        System.out.println(new MinimumDifferenceInAnArray().getMinDiffNaive(arr, n));
        System.out.println(new MinimumDifferenceInAnArray().getMinDiffEfficient(arr, n));
    }
}
