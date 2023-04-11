import java.util.Scanner;

class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        System.out.println("Starting from 0th step");
        if(n==0){
            System.out.print(1);
        }else if(n==1){
            System.out.print(1+" ");
            System.out.print(1);
        }else{
            System.out.print(1+" ");
            System.out.print(1+" ");
            int a=1;
            int b=1;

            for(int i=2;i<=n;i++){
                int c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
    }
}
/*
The Fibonacci numbers are the numbers in the following integer sequence. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation Fn = Fn-1 + Fn-2 with seed values F0 = 0 and F1 = 1.
 */

/*
Find the number of ways to reach the top and, you can skip maximum of 1 stair at a time
5th stair = 5 ways
6th stair = 8 ways
 */
