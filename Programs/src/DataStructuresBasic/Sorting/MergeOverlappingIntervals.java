package DataStructuresBasic.Sorting;

import java.util.Arrays;

/**  Naive Solution:
 *      Take one pair and traverse from 0 to end index in array (for inside for)
 *      & compare pairs as take larger of start values from two pairs and compare with the other pair
 *          ({5,10},{6,8}) => larger start values 5,6 = 6 and compare with 5,10 as 6 > start-5 && 6 < end-10, Yes then Merge
 *      If it lies between it then merge it as  min(i1.start, i2.start) and max(i1.end,i2.end)
 *      and then delete the other pair from an array O(n) time
 *
 *      TC = O(n^3)
 */

/**
 *  Efficient Solution:
 *      Sort by start time in increasing order or Sort by end time in decreasing order
 *      Algorithm: for every interval just need to check only previous merge interval
 *      TC = O(n*log n)
 *
 *      Sort by start time in increasing order
 *
 */

class Interval implements Comparable<Interval>  {
    int s, e;

    Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a) {
        return this.s - a.s;
        // Negative means before
        // Positive means after
    }
};


public class MergeOverlappingIntervals {
    public static void main (String[] args) {
        Interval arr[] = {
                new Interval(5,10),new Interval(3,15),new Interval(18,30), new Interval(2,7) };

        int n = arr.length;

        mergeIntervals(arr, n);
    }

    static void mergeIntervals(Interval arr[], int n) {
        Arrays.sort(arr); // compareTo called => O(n * log n)

        int res = 0;

        for (int i=1; i<n; i++) { // process => O(n)
            if (arr[res].e >=  arr[i].s) { // compare with res of end and start of ith pair start value
                arr[res].e = Math.max(arr[res].e, arr[i].e);
                arr[res].s = Math.min(arr[res].s, arr[i].s);
            }
            else {
                res++;
                arr[res] = arr[i];
            }
        }

        for (int i = 0; i <= res; i++) // print upto res index
            System.out.print(  "[" + arr[i].s + ", " + arr[i].e + "] ");
    }
}
