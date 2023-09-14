package geeksforgeeks.Easy_Level;
// https://practice.geeksforgeeks.org/problems/number-of-divisors1631/1
public class NumberOfDivisors {
    static long count_divisors(int N){
        // code here
        if(N == 3) return 1;

        long count = 1;
        for(long i=2; i*i<=N; i++) {
            if(N%i==0) {
                if(i%3==0) count++;
                if((N/i != i  && (N/i)%3==0))  count++;
            }
        }
        return count == 1 ?  0 : count;
    }
}
/*
Given an integer N, find the number of divisors of N that are divisible by 3.


Example 1:

Input : 6
Output: 2
Explanation: 1, 2, 3, 6 are divisors
of 6 out of which 3 and 6 are divisible
by 3.

Example 2:

Input: 10
Output: 0
Explanation: 1, 2, 5 and 10 are divisors
of 10 but none of them are divisible by 3.


Your Task:

You don't need to read or print anything. Your task is to complete the function count_divisors() which takes N as input parameter and returns count of divisor which are divisible by 3.


Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(1)

 */