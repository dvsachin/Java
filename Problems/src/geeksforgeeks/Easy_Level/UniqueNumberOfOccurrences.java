package geeksforgeeks.Easy_Level;

import geeksforgeeks.School_Level.CountOfSmallerElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class UniqueNumberOfOccurrences {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer,Integer> numberFrequency = new HashMap<Integer,Integer>();
        Set<Integer> unique = new HashSet<>();

        for (int i=0; i<n; i++) {
            if(numberFrequency.containsKey(arr[i]))
                numberFrequency.put(arr[i], numberFrequency.get(arr[i])+1);
            else
                numberFrequency.put(arr[i], 1);
        }

        for (Integer freq : numberFrequency.values()) {
            if(!unique.add(freq)) return false;
        }

        return true;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n  = Integer.parseInt(read.readLine());
            String[] input = read.readLine().trim().split(" ");
            int[] a = new int[n];

            for (int i=0;i<n;i++)
                a[i] = Integer.parseInt(input[i]);

            System.out.println(new UniqueNumberOfOccurrences().isFrequencyUnique(n,a));

        }
    }

}
/*
Given an array arr of N integers, the task is to check whether the frequency of the elements in the array is unique or not. Or in other words, there are no two distinct numbers in array with equal frequency. If all the frequency is unique then return true, else return false.

Example 1:

Input:
N = 5
arr = [1, 1, 2, 5, 5]
Output:
false
Explanation:
The array contains 2 (1’s), 1 (2’s) and 2 (5’s), since the number of frequency of 1 and 5 are the same i.e. 2 times. Therefore, this array does not satisfy the condition.
Example 2:

Input:
N = 10
arr = [2, 2, 5, 10, 1, 2, 10, 5, 10, 2]
Output:
true
Explanation:
Number of 1’s -> 1
Number of 2’s -> 4
Number of 5’s -> 2
Number of 10’s -> 3.
Since, the number of occurrences of elements present in the array is unique. Therefore, this array satisfy the condition.
Your task:
You don't need to read input or print anything. Your task is to complete the function isFrequencyUnique() which take integer N and array arr of size N as arguments, and returns a boolean.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <=105
-109 <= arr[i] <= 109
 */