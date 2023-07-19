package geeksforgeeks.School_Level;

import geeksforgeeks.Medium_Level.LongestPalindromicSubsequence;

import java.util.Scanner;
import java.util.Stack;

public class BinaryRepresentation {
    static String getBinaryRep(int N){
        // code here
        StringBuffer ansWithZeros = new StringBuffer(30);
        StringBuffer ans = new StringBuffer();
        Stack<Integer> binary = new Stack<>();
        while (N >0) {
            binary.push(N%2);
            N/=2;
        }
        while (!binary.isEmpty()) {
            ans.append(binary.pop());
        }

        int zeros = 30-ans.length();

        for (int i=0; i<zeros; i++) {
            ansWithZeros.append(0);
        }

        return ansWithZeros.append(ans).toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            System.out.println(new BinaryRepresentation().getBinaryRep(N));
        }
    }
}

/*
Write a program to print Binary representation of a given number N.

Example 1:

Input:
N = 2
Output:
000000000000000000000000000010
Explanation:
The binary representation of 2 is '10'
but we need to print in 30 bits so append
remaining 0's in the left.
Example 2:

Input:
N = 5
Output:
000000000000000000000000000101
Explanation:
The binary representation of 5 is '101'.
Your Task:
You don't need to read input or print anything. Your task is to complete the function getBinaryRep() which takes an Integer N as input parameter and returns a string of size 30 which is the binary representation of N.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 10^9
 */