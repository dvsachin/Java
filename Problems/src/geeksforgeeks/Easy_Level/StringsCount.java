package geeksforgeeks.Easy_Level;
// https://www.geeksforgeeks.org/problems/count-of-strings-that-can-be-formed-using-a-b-and-c-under-given-constraints1135/1
public class StringsCount {
    static long countStr(long n)	{
        // all a       --> 1
        // 1b and a    --> n
        // 1c and a    --> n
        // 2c and a    --> n*(n-1)/2
        // 1b,1c and a --> n*(n-1)
        // 1b,2c and a --> n(n-1)(n-2)/2

        return  1 +
                2*n +
                n*(n-1)/2 +
                n*(n-1) +
                n*(n-1)*(n-2)/2;
    }
}
/*
Given a length n, count the number of strings of length n that can be made using a, b and c with at-most one b and two c allowed.

Example 1:

Input: n = 1
Output: 3
Explanation: Possible strings are: "a",
"b" and "c"
Example 2:

Input: n = 3
Output: 19
Explanation: Number of strings with 3
occurrances of a: 1
2-a and 1-b: 3
2-a and 1-c: 3
1-a, 1-b and 1-c: 6
1-a and 2-c: 3
1-b and 2-c: 3
So, total number of strings of length 3
is 1 + 3 + 3 + 6 + 3 + 3 = 19
Your Task:
You don't need to read input or print anything. Your task is to complete the function countStr() which takes the n as inputs and returns the total number of valid strings.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ n ≤ 105
 */