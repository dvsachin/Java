package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/small-factorial0854/1
public class SmallFactorial {
    public long find_fact(int n) {
        // Code here
        long fact = 1;
        for(long i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
/*
Calculate factorial of a given number N.


Example 1:

Input: 5
Output: 120
Explanation: 1 * 2 * 3 * 4 * 5 = 120.


Your Task:
You don't need to read or print anything. Your task is to complete the function find_fact() which takes n as input parameter and returns factorial of N.


Expected Time Complexity: O(N)
Expected Space Complexity: O(1)


Constraints:
1 <= N <= 18
 */