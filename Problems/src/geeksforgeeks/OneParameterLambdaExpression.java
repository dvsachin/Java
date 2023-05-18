package geeksforgeeks;

import java.util.Scanner;

interface Multiply {
    public int multiplyBy5(int n);
}
public class OneParameterLambdaExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            Multiply m  = helperFunction();
            System.out.println(m.multiplyBy5(n));
        }
    }
    public static Multiply helperFunction() {
        //Your code here
        //Implement the multiplyBy5(int n) method using lambda expression. The implemented function should return n*5
        return (number) -> number*5;
    }
}
/*
You need to use lambda expression to multiply a given number n by 5.

Example 1:

Input:
5

Output:
25

Explanation:
5 * 5 = 25
Example 2:

Input:
6

Output:
30

Explanation:
6 * 5 = 30
User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Multiply as a return type. Multiply is an interface that has the member function multiplyBy5. Your helperFunction uses lambda expression to implement the multiplyBy5 within helperFunction itself. Then you return the object.
 */
