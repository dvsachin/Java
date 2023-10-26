package leetCode.Easy;

public class Sqrt_X_LinearWay {
    public int mySqrt(int x) { // TC = O(n)
        // Linear or Naive way - to return a floor value of sqrt
        int ans = 1;
        for(int i=1; i<=x; i++) {
            if(i*i <= x) ans = i;
            else break;
        }
        return ans;
    }
}
/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.


Constraints:

0 <= x <= 231 - 1
 */

