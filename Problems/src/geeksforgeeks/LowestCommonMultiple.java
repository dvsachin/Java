package geeksforgeeks;

import java.util.Scanner;

public class LowestCommonMultiple {
    public static int LCM(int a, int b){

        //write your code here
        //return LCM of a and b
        int result = 1;
        int temp = 0;

        if(a > b) temp = a; // find max of a,b
        else temp = b;

        result = temp;


        for(int i = temp; i <= (a*b); i++) {
            if(i%a == 0 && i%b == 0) {
                result = i;
                break;
            }
        }
        return result;



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(LCM(number1, number2));
    }
}

/*
Given two numbers a and b. The task is to find out their LCM.



Example 1:

Input:
a = 5, b = 10
Output:
10
Explanation:
LCM of 5 and 10 is 10
Example 2:

Input:
a = 14, b = 8
Output:
56
Explanation:
LCM of 14 and 8 is 56
Your Task:
You don't need to read input or print anything. Your task is to complete the function LCM() which takes two integers a and b as input and return their LCM.

Constraints:
1 <= a, b <= 103
 */