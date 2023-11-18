package leetCode.Medium;

import java.util.Arrays;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/
public class FrequencyOfTheMostFrequentElement {
    public int maxFrequency(int[] nums, int k) {
        // Sort the array in ascending order
        Arrays.sort(nums);

        int length = nums.length;

        // Calculate the differences between adjacent elements
        long[] differences = new long[length];
        for (int i = 1; i < length; i++)
            differences[i] = (long) nums[i] - (long) nums[i - 1];

        // Calculate the prefix sums of the differences
        long[] prefixSums = new long[length];
        for (int i = 1; i < length; i++)
            prefixSums[i] = prefixSums[i - 1] + differences[i];

        int low = 1, high = length;

        // Binary search for the maximum frequency
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;

            // Check if it's possible to achieve the given frequency with the allowed difference
            if (isPossible(nums, differences, prefixSums, mid, k))
                low = mid;
            else
                high = mid - 1;
        }

        return low;
    }

    // Function to check if it's possible to achieve the given frequency with the allowed difference
    public boolean isPossible(int[] nums, long[] differences, long[] prefixSums, int freq, int k) {
        int length = differences.length;

        long times = 0;

        // Calculate the initial times based on the frequency and the last element in the subarray
        for (int i = freq - 2; i >= 0; i--)
            times += (long) nums[freq - 1] - (long) nums[i];

        long minTimes = times;

        // Iterate from freq-th element to the end of the array
        for (int i = freq; i < length; i++) {
            // Update times by considering the difference in prefix sums and new differences
            times = times - (prefixSums[i - 1] - prefixSums[i - freq]) + differences[i] * (freq - 1);
            minTimes = Math.min(minTimes, times);
        }

        // Check if the minimum times is within the allowed difference (k)
        return minTimes <= (long) k;
    }
}
/*
The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.



Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.
Example 2:

Input: nums = [1,4,8,13], k = 5
Output: 2
Explanation: There are multiple optimal solutions:
- Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
- Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
- Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
Example 3:

Input: nums = [3,9,6], k = 2
Output: 1


Constraints:

1 <= nums.length <= 105
1 <= nums[i] <= 105
1 <= k <= 105
 */