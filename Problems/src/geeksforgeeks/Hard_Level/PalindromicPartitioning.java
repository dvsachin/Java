package geeksforgeeks.Hard_Level;
// https://practice.geeksforgeeks.org/problems/palindromic-patitioning4845/1
public class PalindromicPartitioning {
    static int palindromicPartition(String str) {
        // code here
        int n = str.length();
        int arr[] = new int[n+1];
        arr[0] = 0;

        for(int i=0; i<n; i++){
            int min = (int)(1e9);
            for(int j=i; j>=0; j--){
                if(isPalindrome(j,i,str)){
                    int res = 1+arr[j];
                    min = Math.min(res,min);
                }
            }
            arr[i+1] = min;
        }
        return arr[n]-1;

    }

    static boolean isPalindrome(int i, int j, String str){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
/*
Given a string str, a partitioning of the string is a palindrome partitioning if every sub-string of the partition is a palindrome. Determine the fewest cuts needed for palindrome partitioning of the given string.


Example 1:

Input: str = "ababbbabbababa"
Output: 3
Explaination: After 3 partitioning substrings
are "a", "babbbab", "b", "ababa".
Example 2:

Input: str = "aaabba"
Output: 1
Explaination: The substrings after 1
partitioning are "aa" and "abba".

Your Task:
You do not need to read input or print anything, Your task is to complete the function palindromicPartition() which takes the string str as the input parameter and returns the minimum number of partitions required.


Expected Time Complexity: O(n*n) [n is the length of the string str]
Expected Auxiliary Space: O(n*n)


Constraints:
1 ≤ length of str ≤ 500
 */