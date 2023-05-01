package geeksforgeeks;

import java.util.Scanner;

public class SumAllArrayElements {
    public static int arraySum(int[] numbers) {
        //Just return the sum of the list
        //Don't print here
        int sum = numbers[0];

        for(int i = 1; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i =0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(arraySum(arr));
    }
}
/*
You are given a array that contains integers. You need to return the sum of all array elements.

Example 1:

Input:
numbers = [54, 43, 2, 1, 5]
Output:
105
Explanation: Just sum it 54+43+2+1+5=105.

Example 2:

Input:
numbers = [324, 5, 2, 2]
Output:
333
Explanation: Just sum it 324+5+2+2=333.
Your Task:
Write the code to return the sum of all array elements. The array is provided as a parameter to the function arraySum. Don't print the output, just return it as it will be printed by the driver code.
 */
