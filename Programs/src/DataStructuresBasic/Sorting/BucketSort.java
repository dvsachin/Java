package DataStructuresBasic.Sorting;

import java.util.Collections;
import java.util.Vector;

/** Given: array and K (number of buckets)
 * 1. Find maximum element in an array, Upper limit is max element and lower limit assume as 0
 * 2. calculate range and divide range into 5 buckets (0-19,20-39,40-59,60-79,80-99, ...)
 * 3. Put these elements into individual buckets
 * 4. Sort (Insertion sort if element is less) the elements of individual buckets
 * 5. concatenate the individual buckets
 *
 * TC =
 *  Assuming K ~= N
 *  Best Case = Data is uniformly distributed
 *  The Worst Case = All items go into single bucket
 *      If we use insertion sort to sort the individual bucket elements, then O(n^2)
 *      If use O(n*log n) to sort the individual bucket elements, then O(n*log n)
 */

public class BucketSort {

    public static void main (String[] args) {
        int arr[] = { 30,40,10,80,5,12,70 };
        int n = arr.length; int k=4;
        bucketSort(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    static void bucketSort(int arr[], int n, int k) {

        int max_val = arr[0];
        for(int i=1;i<n;i++)
            max_val = Math.max(max_val,arr[i]); // finding the upper limit

        max_val++; // extra element in range

        @SuppressWarnings("unchecked")
        Vector<Integer>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Integer>();
            // array of buckets and each bucket is a list of Integers
        }

        for (int i = 0; i < n; i++) {
            int idx = (arr[i] * k) / max_val;
            buckets[(int)idx].add(arr[i]);
            // adding elements of given array into individual buckets
        }

        for (int i = 0; i < k; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
                // concatenate the individual bucket element into arr array
            }
        }
    }
}
