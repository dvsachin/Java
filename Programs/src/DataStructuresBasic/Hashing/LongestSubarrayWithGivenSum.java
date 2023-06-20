package DataStructuresBasic.Hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithGivenSum {
    public static void main (String[] args) {
        int arr[] = new int[]{5, 8, -4, -4, 9, -2, 2};
        int n = arr.length;
        int sum = 0;

//        System.out.println(largestSubarrayWithSumXNaive(arr, n, sum));
        System.out.println(largestSubarrayWithSumXEfficient(arr, n, sum));

    }

    static int largestSubarrayWithSumXNaive(int[] arr, int n, int k) {
        int currentSum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            currentSum = 0;

            for (int j = i; j < n; j++) {
                currentSum = currentSum + arr[j];

                if (currentSum == k)
                    maxLen = Math.max(maxLen, j - i + 1); // 0-2 => 2-0+1 = 3 length
            }


        }
        return maxLen;
    }


    static int largestSubarrayWithSumXEfficient(int[] arr, int n, int k) { // TC = O(n) and SC = O(n)
        // HashMap to store (sum, index) tuples
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        // traverse the given array
        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;

            // make an entry for 'sum' if it is
            // not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map'
            // or not
            if (map.containsKey(sum - k)) {

                // update maxLength
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }

}
