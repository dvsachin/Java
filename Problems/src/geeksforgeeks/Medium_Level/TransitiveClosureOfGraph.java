package geeksforgeeks.Medium_Level;

import java.util.ArrayList;
import java.util.Collections;

// https://www.geeksforgeeks.org/problems/transitive-closure-of-a-graph0930/1
public class TransitiveClosureOfGraph {
    static ArrayList<ArrayList<Integer>> transitiveClosure(int N, int graph[][])
    {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            ArrayList<Integer> vis = new ArrayList<Integer>(Collections.nCopies(N,0));
            dfs(i,graph,vis,N);
            list.add(vis);
        }
        return list;
    }

    static void dfs(int i, int[][] graph, ArrayList<Integer> vis, int N){
        vis.set(i,1);
        for(int j=0; j<N; j++){
            if(graph[i][j]==1 && vis.get(j)==0) dfs(j,graph,vis,N);
        }
    }
}
/*
Given a directed graph, determine whether a vertex j is reachable from another vertex i for all vertex pairs (i, j) in the given graph. Here, vertex j is reachable from another vertex i means that there is a path from vertex i to j. The reachability matrix is called the transitive closure of a graph. The directed graph is represented by an adjacency matrix where there are N vertices.

Example 1:

Input: N = 4
graph = {{1, 1, 0, 1},
         {0, 1, 1, 0},
         {0, 0, 1, 1},
         {0, 0, 0, 1}}
Output: {{1, 1, 1, 1},
         {0, 1, 1, 1},
         {0, 0, 1, 1},
         {0, 0, 0, 1}}
Explanation:
The output list shows the reachable indexes.
Example 2:

Input: N = 3
graph = {{1, 0, 0},
         {0, 1, 0},
         {0, 0, 1}}
Output: {{1, 0, 0},
         {0, 1, 0},
         {0, 0, 1}}
Explanation:
The output list shows the reachable indexes.
Your Task:
You do not need to read input or print anything. Your task is to complete the function transitiveClosure() which takes an integer N and a 2D array graph(adjacency matrix of the graph) as input parameters and returns the transitive closure of the graph in the form of 2D array.

Expected Time Complexity: O(N3)
Expected Auxiliary Space: O(N2)

Constraints:
1 ≤ N ≤ 100
 */