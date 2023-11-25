package geeksforgeeks.Easy_Level;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/pascal-triangle0652/1
public class PascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Long> prev = new ArrayList<>();
        prev.add(1L);

        for(int i=1; i<n; i++){
            ArrayList<Long> next = new ArrayList<>();
            next.add(1L);

            for(int j=1; j<prev.size(); j++){
                next.add((prev.get(j)+prev.get(j-1))%1000000007);
            }
            next.add(1L);
            prev = next;
        }

        return prev;
    }
}
/*
Given a positive integer N, return the Nth row of pascal's triangle.
Pascal's triangle is a triangular array of the binomial coefficients formed by summing up the elements of previous row.
The elements can be large so return it modulo 109 + 7.

File:PascalTriangleAnimated2.gif

Example 1:

Input:
N = 4
Output:
1 3 3 1
Explanation:
4th row of pascal's triangle is 1 3 3 1.
Example 2:

Input:
N = 5
Output:
1 4 6 4 1
Explanation:
5th row of pascal's triangle is 1 4 6 4 1.
Your Task:
Complete the function nthRowOfPascalTriangle() which takes n, as input parameters and returns an array representing the answer. You don't to print answer or take inputs.

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(N2)

Constraints:
1 ≤ N ≤ 103
 */