package geeksforgeeks.Medium_Level;
// https://www.geeksforgeeks.org/problems/number-of-paths0926/1
public class NumberOfPaths {
    int mod = 1000000007;
    long numberOfPaths(int M, int N) {
        // Code Here
        int n = M+N-2;
        int r = M-1<N-1?M-1:N-1;
        long res = 1;

        for(int i=1; i<=r; i++){
            res = (res*(n-r+i)%mod * modInverse(i,mod))%mod;
        }
        return res;
    }

    long modInverse(int a, int b){
        int x = 1, y = 0;
        while(a>1){
            int q = a/b, temp = b;
            b = a%b;
            a = temp;
            temp = y;
            y = x-q*y;
            x = temp;
        }
        return x<0?x+mod:x;
    }
}

/*
GfG Weekly + You = Perfect Sunday Evenings!
Register for free now

banner
The problem is to count all the possible paths from top left to bottom right of an MxN matrix with the constraints that from each cell you can either move to right or down.

Return answer modulo 109+7.

Example 1:

Input:
M = 3 and N = 3
Output: 6
Explanation:
Let the given input 3*3 matrix is filled
as such:
A B C
D E F
G H I
The possible paths which exists to reach
'I' from 'A' following above conditions
are as follows:ABCFI, ABEHI, ADGHI, ADEFI,
ADEHI, ABEFI
Example 2:

Input:
M = 1 and N = 4
Output: 1
Explanation:
There is only one direction to go in,
and thus, there is only one path possible.
Your Task
You don't need to read input or print anything. Your task is to complete the function numberOfPaths() which takes the integer M and integer N as input parameters and returns an integer, the number of paths.

Expected Time Complexity: O(M)
Expected Space Complexity: O(1)

Constraints:
1 ≤ N ≤ 108
1 ≤ M ≤ 105


 */