package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JavaSwitchCaseStatement {
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            int choice = Integer.parseInt(reader.readLine());
            String[] a = reader.readLine().trim().split("\\s+");
            List<Double> arr = new ArrayList<>();

            for (int i = 0; i < choice; i++) {
                arr.add(Double.parseDouble(a[i]));
            }

            if (choice == 1)
                System.out.println(String.format("%.2f",new JavaSwitchCaseStatement().switchCase(choice,arr)));
            else
                System.out.println( (int) new JavaSwitchCaseStatement().switchCase(choice,arr));
        }
    }
        static double switchCase(int choice, List<Double> arr){
            // code here
            switch(choice) {
                case 1:
                    Double radius = arr.get(0);
                    return Math.PI*radius*radius;

                case 2:
                    Double l =  arr.get(0);
                    Double b =  arr.get(1);
                    return l*b;

                default: return 0;
            }
        }
}

/*
Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
If the user's choice is 1, calculate the area of the circle having the given radius(R).
Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).

Example 1:

Input:
choice = 1,
R = 5
Output: 78.53981633974483
Explaination: The choice is 1.
So we have to calculate the area of the circle.
Example 2:

Input:
choice = 2,
L = 5, B = 10
Output: 50
Explaination: Here we have to calculate the
area of the rectangle.
Your Task:
You do not need to read input or print anything. Your task is to complete the function switchCase() which takes choice and a list arr[], containing the single value R or the two values L and B, as input parameters. It should return the area of the desired geometrical figure.

Note: Use Math.PI for the value of pi.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ R, L, B ≤ 100
 */