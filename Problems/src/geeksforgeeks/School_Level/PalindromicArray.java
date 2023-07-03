package geeksforgeeks.School_Level;

import java.util.Scanner;

public class PalindromicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            System.out.println(new PalindromicArray().palinArray(a, n));
        }
    }

    public static int palinArray(int[] a, int n) {
        //add code here.
        int result = 1;

        for(int i=0; i<n; i++) {
            if(!isPalindrome(a[i])) {
                result = 0;
                break;
            }
        }
        return result;
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int start = 0, end = str.length()-1 ;

        boolean palindromeFlag = true;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                palindromeFlag = false;
                break;
            }
            start++;
            end--;
        }

        return palindromeFlag;
    }
}
/*
Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.

Example 1:

Input:
5
111 222 333 444 555

Output:
1

Explanation:
A[0] = 111 //which is a palindrome number.
A[1] = 222 //which is a palindrome number.
A[2] = 333 //which is a palindrome number.
A[3] = 444 //which is a palindrome number.
A[4] = 555 //which is a palindrome number.
As all numbers are palindrome so This will return 1.
Example 2:

Input:
3
121 131 20

Output:
0

Explanation:
20 is not a palindrome hence the output is 0.

Constraints:
1 <=T<= 50
1 <=n<= 20
1 <=A[]<= 10000


 */
