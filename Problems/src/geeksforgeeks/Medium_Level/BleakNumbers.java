package geeksforgeeks.Medium_Level;
// https://practice.geeksforgeeks.org/problems/bleak-numbers1552/1
public class BleakNumbers {
    public int is_bleak(int n)
    {
        // Code here
        int m = n;
        int x = 0;
        while(n>0){
            n=n/2;
            x++;
        }

        for(int i=m-1; i>=m-x; i--){
            if(i+countSetBits(i)==m) return 0;
        }

        return 1;
    }
    int countSetBits(int x){
        int ans = 0;
        while(x>0){
            if((x&1)==1) ans++;
            x=x>>1;
        }
        return ans;
    }
}
/*
Given an integer, check whether it is Bleak or not.

A number n is called Bleak if it cannot be represented as sum of a positive number x and set bit count in x, i.e., x + countSetBits(x) is not equal to n for any non-negative number x.

Example 1:

Input:
4
Output:
1
Explanation:
There is no x such that x + countSetbit(x) = 4
Example 2:

Input:
3
Output:
0
Explanation:
3 is a Bleak number as 2 + countSetBit(2) = 3.
Your Task:
You don't need to read or print anything. Your task is to complete the function is_bleak() which takes n as input parameter and returns 1 if n is not a Bleak number otherwise returns 0.

Expected Time Complexity: O(log(n) * log(n))
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 109
 */