package DataStructuresBasic.Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithZeroSum {
    public static void main (String[] args)
    {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;

//        System.out.println(isSubArray(arr, n));
        System.out.println(ZeroSumSubarrayEfficient(arr, n));

    }

    static int ZeroSumSubarrayEfficient(int arr[], int n) {
        Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);

        for(int i = 0; i < n; i++) {
            prefix_sum = prefix_sum +  arr[i];

            if(us.contains(prefix_sum) == true)
                return 1;

            us.add(prefix_sum);
        }
        return 0;
        //TC = O(n)
    }

    static boolean isSubArray(int arr[], int n) { // Naive solution for find out is there is any sub array sum is zero or not
        int currentSum = 0;
       for(int i=0; i<n; i++) {
           currentSum = 0;

           for (int j=i; j<n; j++) {
               currentSum = currentSum + arr[j];

               if(currentSum == 0) return true;
           }
       }
       return  false;
    }
//    TC = O(n^2)
}

