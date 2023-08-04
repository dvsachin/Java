package geeksforgeeks.Basic_Level;

import geeksforgeeks.School_Level.JavaSwitchCaseStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class FindUniqueElement {
    public int findUnique(int a[], int n, int k){
        Integer ans = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();

        for (int i=0; i<n; i++) {
          int curr = a[i];
          if(freq.containsKey(curr)) freq.put(curr, freq.get(curr)+1);
          else freq.put(curr,1);
        }

        for (int i=0; i<n; i++) {
            if(!(freq.get(a[i])%k == 0)) {
                ans = a[i];
                break;
            }
        }

        return ans;

    }
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int k  = Integer.parseInt(stringTokenizer.nextToken());

            int[] a = new int[n];
            String[] ip = reader.readLine().trim().split(" ");
            for (int i=0;i<n;i++) {
                a[i] = Integer.parseInt(ip[i]);
            }
            System.out.println(new FindUniqueElement().findUnique(a,n,k));
        }
    }
}
/*
Given an array of size n which contains all elements occurring in multiples of K, except one element which doesn't occur in multiple of K. Find that unique element.


Example 1:

Input :
n = 7, k = 3
arr[] = {6, 2, 5, 2, 2, 6, 6}
Output :
5
Explanation:
Every element appears 3 times except 5.


Example 2:

Input  :
n = 5, k = 4
arr[] = {2, 2, 2, 10, 2}
Output :
10
Explanation:
Every element appears 4 times except 10.


Your Task:
You don't need to read input or print anything. Your task is to complete the function findUnique() which takes the array A[], its size N and an integer K as inputs and returns the element with single occurence.



Expected Time Complexity: O(N. Log(A[i]) )
Expected Auxiliary Space: O( Log(A[i]) )



Constraints:
3<= N<=2*105
2<= K<=2*105
1<= A[i]<=109


 */
