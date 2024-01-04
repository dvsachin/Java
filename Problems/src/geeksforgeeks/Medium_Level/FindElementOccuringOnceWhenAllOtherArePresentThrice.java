package geeksforgeeks.Medium_Level;
// https://www.geeksforgeeks.org/problems/find-element-occuring-once-when-all-other-are-present-thrice/1
public class FindElementOccuringOnceWhenAllOtherArePresentThrice {
    static int singleElement(int[] arr , int N) {
        // code here
        int res = 0;
        for(int i=0; i<32; i++){
            int setbit=0;
            for(int j=0; j<N; j++){
                if(((arr[j])&(1<<i))!=0) setbit++;
            }
            if(setbit%3==1){
                res = res | (1<<i);
            }
        }
        return res;
    }
}
/*
Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.

Example 1:

Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
Example 2:

Input:
N = 10
arr[] = {3, 2, 1, 34, 34, 1, 2, 34, 2, 1}
Output:
3
Explanation:
All elements except 3 occurs thrice in the array.
Your Task:
You do not need to take any input or print anything. You task is to complete the function singleElement() which takes an array of integers arr and an integer N which finds and returns the element occuring once in the array.

Constraints:
1 ≤ N ≤ 105
-109 ≤ A[i] ≤ 109

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).
 */
