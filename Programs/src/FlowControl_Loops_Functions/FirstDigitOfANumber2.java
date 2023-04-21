package FlowControl_Loops_Functions;

import java.util.Scanner;
// using library functions
class FirstDigitOfANumber2 {
    public static int firstDigit(int n){
        int power = (int) Math.log10(n); // gives the log value and typecast to int
        int a = (int) Math.pow(10,power);   // make power of 10 with log value of a number
        int ans = n/a; // divide it number by less than the number of 0's digit and,  int / int = int
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(firstDigit(n));
    }
}

