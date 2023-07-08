package geeksforgeeks.School_Level;

import java.util.Properties;
import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-->0) {
            long n = scanner.nextLong();
            if(new FascinatingNumber().fascinating(n))
                System.out.println("Fascinating");
            else System.out.println("Not Fascinating");
        }
    }
    boolean fascinating(long n) {
        // code here
        if (n < 100)
            return false;

        int times[] = new int[10];
        long multipliedBy2 = n * 2;
        long multipliedBy3 = n * 3;

        String s = "" + n + multipliedBy2 + multipliedBy3;

        for (int i = 0; i < s.length(); i++) {
            int number = s.charAt(i) - '0';

            if (times[number] > 0 && number != 0)
                return false;
            else
                times[number]++;
        }

        for (int i = 1; i < times.length; i++)
            if (times[i] == 0) return false;

        return true;
    }



}

/*
Given a number N. Your task is to check whether it is fascinating or not.
Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and when both these products are concatenated with the original number, then it results in all digits from 1 to 9 present exactly once.

Example 1:

Input:
N = 192
Output: Fascinating
Explanation: After multiplication with 2
and 3, and concatenating with original
number, number will become 192384576
which contains all digits from 1 to 9.
Example 2:

Input:
N = 853
Output: Not Fascinating
Explanation: It's not a fascinating
number.
Your Task:
You don't need to read input or print anything. Your task is to complete the function fascinating() which takes the integer n parameters and returns boolean(True or False) denoting the answer.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
100 <= N <= 2*109


 */