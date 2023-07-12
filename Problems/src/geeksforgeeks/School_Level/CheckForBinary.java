package geeksforgeeks.School_Level;

import java.util.Scanner;
import java.util.SortedMap;

public class CheckForBinary {
    boolean isBinary(String str) {
        //Your code here
        boolean flag = false;

        for (int i=0; i< str.length(); i++) {

            if((str.charAt(i) - '0') == 0 || (str.charAt(i) - '1' == 0) )
                flag = true;
            else
                return false;
        }

        return flag;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String str = sc.nextLine();

            if(new CheckForBinary().isBinary(str))
                System.out.println(1);
            else
                System.out.println(0);

        }
    }
}
/*
Given a non-empty sequence of characters str, return true if sequence is Binary, else return false

Example 1:

Input:
str = 101
Output:
1
Explanation:
Since string contains only 0 and 1, output is 1.
Example 2:

Input:
str = 75
Output:
0
Explanation:
Since string contains digits other than 0 and 1, output is 0.


Your Task:
Complete the function isBinary() which takes an string str as input parameter and returns 1 if str is binary and returns 0 otherwise.



Expected Time Complexity: O(|s|)
Expected Auxiliary Space: O(1)



Constraints:
1 <=T<= 50
1 <=Length of str<= 10000
 */
