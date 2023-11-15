package geeksforgeeks.Easy_Level;
// https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1
public class FindTransitionPoint {
    int transitionPoint(int arr[], int n) {
        int l=0,r=n-1;
        int res = -1;

        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==1) {
                r=mid-1;
                res = mid;
            }
            else l = mid+1;
        }
        return res;
    }
}
/*
Hiring Challenge for Working Professionals on 10th November.
Apply to 6 Companies through 1 Contest!

banner
Given a sorted array containing only 0s and 1s, find the transition point, i.e., the first index where 1 was observed, and before that, only 0 was observed.

Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition
point where 1 begins.
Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.
Your Task:
You don't need to read input or print anything. The task is to complete the function transitionPoint() that takes array arr and N as input parameters and returns the 0-based index of the position where 0 ends and 1 begins. If array does not have any 1, return -1. If array does not have any 0, return 0.

Expected Time Complexity: O(Log(N))
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
0 ≤ arr[i] ≤ 1


 */