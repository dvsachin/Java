package geeksforgeeks;

import java.util.Scanner;

public class Average {
    static int posAverage(int numbers[], int size) {
        //code here
        int sum = 0;
        int positiveNumberCount = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 0) {
                sum = sum + numbers[i];
                positiveNumberCount++;
            }
        }

        int average = sum / positiveNumberCount;

        return average;


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i =0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(posAverage(arr,size));
    }
}
/*
You are given an array numbers that contains integers. You need to return the floor value of average of the non negative integers.

Note: floor returns the nearest mathematical integer value that is less than or equal to the argument.

Example 1:

Input:
numbers = [-12, 8, -7, 6, 12, -9, 14]
Output:
avg = 10
Explanation: The positive numbers are
8 6 12 14.
The sum is 8+6+12+14 = 40,
Average = 40/4 = 10

Example 2:

Input:
numbers = [1, 2, 3]
Output:
avg = 2
Explanation: The positive numbers are
1 2 3.
The sum is 1+2+3 = 6, Average = 6/3 = 2
Your Task:
Write the code at the mentioned place and return the floor value of average of the positive numbers.
The function posAverage takes numbers array & its size as arguments and expects floor value of average of non-negative numbers as a return value.
 */