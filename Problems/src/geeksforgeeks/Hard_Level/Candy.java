package geeksforgeeks.Hard_Level;
// https://www.geeksforgeeks.org/problems/candy/1
public class Candy {
    static int minCandy(int n, int rat[]) {
        // code here
        int[] arr = new int[n];
        arr[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            if(rat[i]>rat[i+1]) arr[i]=arr[i+1]+1;
            else arr[i] = 1;
        }

        for(int i=1; i<n; i++){
            if(rat[i]>rat[i-1] && arr[i]<=arr[i-1]) arr[i] = arr[i-1]+1;
        }
        int res = 0;
        for(int x : arr) res+=x;
        return res;
    }
}
/*
There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:

Each child must have atleast one candy.
Children with a higher rating than its neighbors get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute.

Example 1:

Input:
N = 3
ratings = [1, 0, 2]
Output:
5
Explanation:
You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input:
N = 3
ratings = [1, 2, 2]
Output:
4
Explanation:
You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it statisfies the above two conditions.
Your Task:
You don't need to read input or print anything. Your task is to complete the function minCandy() which takes the interger N and integer array ratings as parameters and returns the minimum number of candies you need to have to distribute.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
0 ≤ ratingsi ≤ 109


 */