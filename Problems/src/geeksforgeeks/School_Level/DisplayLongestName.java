package geeksforgeeks.School_Level;

import java.util.Scanner;

public class DisplayLongestName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] names = new String[n];

            for (int i = 0; i < n; i++)
                names[i] = sc.next();

            System.out.println(new DisplayLongestName().longest(names,n));
        }
    }

    String longest(String names[], int n) {
        String maxLengthString = names[0];

        for(int i=1; i<n; i++) {
            if(names[i].length() > maxLengthString.length()) maxLengthString = names[i];
        }

        return maxLengthString;
    }
}
/*
Given a list of names, display the longest name.


Example:

Input:
N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks


Your Task:
You don't need to read input or print anything. Your task is to complete the function longest() which takes the array names[] and its size N as inputs and returns the Longest name in the list of names.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)



Constraints:
1 <= N <= 100
1 <= |length of name| <= 1000
 */