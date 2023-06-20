package DataStructuresBasic.Hashing;

import java.util.HashSet;
import java.util.Set;

public class SubarrayWithGivenSum {
    public static void main (String[] args) {
        int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        int n = arr.length;

//        System.out.println(isSumNaive(arr, n, sum));
        System.out.println(isSumEfficient(arr, n, sum));

    }

    static boolean isSumNaive(int arr[], int n, int sum) { // TC = O(n^2) and SC = O(1)
        for(int i=0;i<n;i++) {
            int curr_sum=0;

            for(int j=i;j<n;j++) {
                curr_sum += arr[j];
                if(curr_sum == sum)
                    return true;
            }
        }
        return false;
    }
    static boolean isSumEfficient(int arr[], int n, int sum) { // TC = O(n) and SC = O(n)
        Set<Integer> s = new HashSet<Integer>();
        int pre_sum = 0;

        for(int i = 0; i < n; i++) {
            pre_sum += arr[i];

            if(pre_sum == sum)
                return true;

            if(s.contains(pre_sum-sum) == true)
                return true;

            s.add(pre_sum);
        }

        return false;
    }
}
