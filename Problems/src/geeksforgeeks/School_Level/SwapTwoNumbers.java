package geeksforgeeks.School_Level;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t-- >0) {
           int a = sc.nextInt();
           int b = sc.nextInt();
           List<Integer> ans = new SwapTwoNumbers().get(a,b);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
    static List<Integer> get(int a, int b){
        // code here
        List<Integer> ans = new ArrayList<Integer>();

        a = a+b;
        b = a-b;
        a = a-b;

        ans.add(a);
        ans.add(b);

        return ans;
    }
}

/*
Swap given two numbers and print them. (Try to do it without a temporary variable.) and return it.

Example 1:

Input: a = 13, b = 9
Output: 9 13
Explanation: after swapping it
becomes 9 and 13.
â€‹Example 2:

Input: a = 15, b = 8
Output: 8 15
Explanation: after swapping it
becomes 8 and 15.
Your Task:
You don't need to read input or print anything. Your task is to complete the function get() which takes a, b as inputs and returns the list of integers contains the new value of a and b after swap.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ a, b ≤ 106


 */