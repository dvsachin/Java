package geeksforgeeks;

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class MaximumAreaRectangle {
    static int calculate_Area(Rectangle[] arr){

        // Your code here
        int[] areas = new int[arr.length];
        int maxArea = 0;

        for(int i=0; i< arr.length; i++) {
            areas[i] = arr[i].length * arr[i].breadth;
        }

        for(int i=0; i< areas.length; i++) {
            if(maxArea < areas[i]) maxArea = areas[i];
        }

        return maxArea;

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        Rectangle[] rectPair = new Rectangle[size];

        for(int i = 0; i < size; i++) {
            int length = scanner.nextInt();
            int breadth = scanner.nextInt();
            rectPair[i] = new Rectangle(length,breadth);

        }

        System.out.println(calculate_Area(rectPair));
    }
}

/*
Given N  pairs of rectangles, where each pair denotes the length L and breadth B of the ith rectangle. The task is to return the maximum area of the rectangle.

Example 1:

Input:
N = 3
rect[] = {{1,2},
          {3,4},
          {5,6}}
Output:
30

Explanation:
1. Total area of Rect. 1 = 1 * 2 = 2
2. Total area of Rect. 2 = 3 * 4 = 12
3. Total area of Rect. 3 = 5 * 6 = 30
4. Out of all rectangles, Rectangle 3 has the maximum area.

Example 2:

Input:
N = 2
rect[] = {{12,3},
          {40,5}}

Output:
200

Explanation:
1. Total area of Rect. 1 = 12 * 3 = 36
2. Total area of Rect. 2 = 40 * 5 = 200.
3. Out of all rectangles, Rectangle 2 has the maximum area.
User Task: Your task is to complete the function calculate_Area() which returns maximum area. Use area() function in Rectangle class.

Constraints:
1 <= N <= 103
1 <= L, B <= 104
1 <= Area <= 108
 */