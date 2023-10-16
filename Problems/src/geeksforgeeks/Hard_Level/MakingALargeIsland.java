package geeksforgeeks.Hard_Level;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// https://practice.geeksforgeeks.org/problems/making-a-large-island/1
public class MakingALargeIsland {
    static HashMap<Integer,Integer> hm = new HashMap<>();
    public int largestIsland(int n,int[][] grid) {
        // code here
        int key = 2;
        boolean vis[][] = new boolean [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int count = dfs(i,j,grid,key,vis,n);
                    hm.put(key++,count);
                }
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0){

                    int d = (i+1<n)?grid[i+1][j]:0;
                    int u = (i-1>=0)?grid[i-1][j]:0;
                    int l = (j-1>=0)?grid[i][j-1]:0;
                    int r = (j+1<n)?grid[i][j+1]:0;

                    Set<Integer> set = new HashSet<>();
                    set.add(d); set.add(u); set.add(l); set.add(r);
                    int res = 1;
                    for(int val : set){
                        res = res + hm.getOrDefault(val,0);
                    }
                    ans = Math.max(ans,res);
                }
            }
        }
        if(ans==0) return n*n;
        return ans;
    }
    static int dfs(int i, int j, int[][] grid, int key, boolean vis[][], int n){
        if(i<0 || j<0 || i>=n ||j>=n || grid[i][j]==0 || vis[i][j]) return 0;
        vis[i][j] = true;
        grid[i][j] = key;

        return 1+ dfs(i+1,j,grid,key,vis,n)+
                    dfs(i-1,j,grid,key,vis,n)+
                    dfs(i,j+1,grid,key,vis,n)+
                    dfs(i,j-1,grid,key,vis,n);
    }
}
/*
You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1. A group of connected 1s forms an island. Two 1s are connected if they share one of their sides with each other.

Return the size of the largest island in the grid after applying this operation.

Example 1:

Input:
grid = [[1,0],[0,1]]
Output:
3
Explanation:
Change any one 0 to 1 and connect two 1s, then we get an island with area = 3.
Example 2:

Input:
grid = [[1,1],[1,0]]
Output:
4
Explanation:
Change the only 0 to 1 and make the island bigger, then we get an island with area = 4.
Example 3:

Input:
grid = [[1,1],[1,1]]
Output:
4
Explanation:
Can't change any 0 to 1, only one island possible with area = 4.
Your Task:

You don't have to read input or print anything. You have to complete the functions largestIsland(), which takes binary matrix as input and returns an integer denoting the size of the largest island in grid after applying the operation.

Constraints:

1 <= n <= 500
0 <= grid[i][j] <= 1 (grid[i][j] ∈ {0, 1} and 0<=i,j<n)
 */