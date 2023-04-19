package geeksforgeeks;

import java.util.Scanner;

public class ForLoopPrimeCheck {
    static void isPrime(int n) {
        // Your code here
        boolean flag = true;

        if(n == 1) {
            System.out.println("No");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i == 0) {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        isPrime(number);
    }

}
/*
What do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very powerful. Majority of coding questions need loops to work. You can't even input testcases without loops!
Here, we will use for loop and check if the given number n is prime or not.
Note:  A number is prime if it's divisible by itself and 1. Also, 1 is not prime.

Example 1:

Input:
1

Output:
No
Example 2:

Input:
2

Output:
Yes
Your Task:
Your task is to complete the provided function.
Also, add a next line while printing out the result ("No"/"Yes").

Constraints:
1 <= a <= 1000
 */