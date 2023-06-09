package geeksforgeeks;

import java.util.Scanner;

interface Hello {
    public void sayHello();
}

public class NoParameterLambdaExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            Hello h = helperFunction();
            h.sayHello();
        }
    }
    public static Hello helperFunction() {
        //Your code here
        //Implement sayHello using lambda expression and return the object.
        //Write this in the lambda expression: System.out.println("Hello")
/*          Hello p = () -> {
            System.out.println("Hello");
        };

    return p;

 */
        return  () -> System.out.println("Hello");
    }
}

/*
You need to use lambda expression to print "Hello".

Example 1 :

Input:
No Input
Output:
Hello
Example 2 :

Input:
No Input
Output:
Hello

User Task:
You need to complete the function helperFunction that does not take any argument. This function expects an object of Hello as a return type. Hello is an interface that has the member function sayHello. Your helperFunction uses lambda expression to implement the sayHello within helperFunction itself. Then you return the object. The driver code will call the sayHello method using the returned object.
 */