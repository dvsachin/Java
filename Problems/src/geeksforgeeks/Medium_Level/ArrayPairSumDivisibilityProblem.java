package geeksforgeeks.Medium_Level;
// https://www.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1
public class ArrayPairSumDivisibilityProblem {
    public boolean canPair(int[] nums, int k) {
        // Code here
        int[] arr = new int[k];
        for(int i=0; i<nums.length; i++) arr[nums[i]%k]++;

        if(arr[0]%2==1) return false;
        int i=1,j=k-1;

        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++; j--;
        }

        return true;
    }
}
/*
Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input :
nums = [9, 5, 7, 3]
k = 6
Output:
True
Explanation:
{(9, 3), (5, 7)} is a
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.
Example 2:

Input :
nums = [4, 4, 4]
k = 4
Output:
False
Explanation:
You can make 1 pair at max, leaving a single 4 unpaired.
Your Task:
You don't need to read or print anything. Your task is to complete the function canPair() which takes array nums and k as input parameter and returns true if array can be divided into pairs such that sum of every pair is divisible by k otherwise returns false.

Expected Time Complexity: O(n)
Expected Space Complexity : O(n)

Constraints:
1 <= length( nums ) <= 105
1 <= numsi <= 105
1 <= k <= 105
 */
