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
