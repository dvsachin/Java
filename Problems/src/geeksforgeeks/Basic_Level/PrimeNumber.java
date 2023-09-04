package geeksforgeeks.Basic_Level;
// https://practice.geeksforgeeks.org/problems/prime-number2314/1

public class PrimeNumber {
    static int isPrime(int n){
        // code here
        if(n==1)
            return 0;

        if(n==2 || n==3)
            return 1;

        if(n%2==0 || n%3==0)
            return 0;

        for(int i=5; i*i<=n; i=i+6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return 0;
        }

        return 1;
    }
}

/*
For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.


Example 1:

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.
Example 2:

Input:
N = 25
Output:
0
Explanation:
25 has 3 factors 1, 5, 25

Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() which takes an integer N as input parameters and returns an integer, 1 if N is a prime number or 0 otherwise.


Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(1)

 */