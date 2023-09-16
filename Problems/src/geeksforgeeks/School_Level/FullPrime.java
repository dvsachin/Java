package geeksforgeeks.School_Level;

public class FullPrime {
    static int fullPrime(int N){
        //code here
        boolean isPrimeCheck = isPrime(N);
        if(!isPrimeCheck) return 0;

        // if Number is prime
        while(N > 0) {
            int currentNum = N %10;
            if(!isPrime(currentNum))  return 0;

            N = N /10;
        }
        return 1;
    }

    static boolean isPrime(int n) {
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
/*
Given a number N.Check if it is Full Prime or not.
Note : A full prime number is one in which the number itself is prime and all its digits are also prime.


Example 1:

Input:
N=31
Output:
0
Explanation:
N is prime but since 1 is not a
prime so all the digits of N
are not prime.So, Answer is 0.

Example 2:

Input:
N=37
Output:
1
Explanation:
N is prime and so is all of its digits.
Thus, Answer is 1.

Your Task:
You don't need to read input or print anything.Your task is to complete the function fullPrime() which takes the number N as input parameter and returns 1 if the number is Full Prime.Otherwise return 0.


Expected Time Complexity:O(Sqrt(N))
Expected Auxillary Space:O(1)
 */