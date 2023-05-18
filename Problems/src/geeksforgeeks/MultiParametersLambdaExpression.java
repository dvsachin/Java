package geeksforgeeks;

import java.util.Scanner;

interface Add {
    public int addParameters(int x, int y);
}
public class MultiParametersLambdaExpression {
    public static Add helperFunction() {
        //Your code here
        //Implement the addParameters method that returns x+y.
        return (x, y) -> x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            Add a = helperFunction();

            System.out.println(a.addParameters(x, y));
        }
    }
}

/*
You need to use lambda expression to add two numbers x and y.

Example 1 :

Input:
5 7

Sample Output:
12

Explanation:
5+7 = 12
Example 2 :

Input:
1 5

Sample Output:
6

Explanation:
1+5 = 6
User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Add as a return type. Add is an interface that has the member function addParameters. Your helperFunction uses lambda expression to implement the addParameters within helperFunction itself. Then you return the object.
 */