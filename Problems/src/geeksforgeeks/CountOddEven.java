package geeksforgeeks;

import java.util.Scanner;

public class CountOddEven {
    static void countOddEven(int a[], int n) {

        // Your code here
        int countEven = 0, countOdd = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) countEven++;
            else countOdd++;
        }
        System.out.print(countOdd+" "+countEven);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i<size; i++)  numbers[i] = scanner.nextInt();

        countOddEven(numbers, size);
    }
}

/*
Given an array A of N elements. The task is to count number of even and odd elements in the array.

Example 1:

Input:
5
1 2 3 4 5

Output:
3 2

Explanation:
In the given array, there are 3 odd elements
(1, 3, 5) and 2 even elements (2 and 4).
Example 2:

Input:
4
1 6 18 7

Output:
2 2

Explanation:
In the given array, there are 2 odd
elements (1, 7) and 2 even elements (6 and 18).
Your Task:
Your task is to complete the function countOddEven() which should print number of odd and number of even elements in a single line seperated by space. You don't need to provide the new line.

Constraints:
1 <= N <= 106
1 <= Ai <= 106
 */