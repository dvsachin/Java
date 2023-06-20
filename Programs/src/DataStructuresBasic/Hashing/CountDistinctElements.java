package DataStructuresBasic.Hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;

//        System.out.println(countDistinctNaive(arr, n));
        System.out.println(countDistinctEfficient(arr, n));

    }

    static int countDistinctNaive(int arr[], int n) { // TC=O(n^2) and SC=)(1)
       int res = 0;
       for(int i = 0; i < n; i++) {
            boolean flag = false;
           for(int j= 0; j < i; j++) {
               if(arr[i] == arr[j])  {
                   flag = true;
                   break;
               }
           }
           if(flag == false) res++;
        }
    return res;
    }
    static int countDistinctEfficient(int arr[], int n) { // TC=O(n) and SC=)(n)
        Set<Integer> hs = new HashSet<Integer>();
        for(int i = 0; i < n; i++)
            hs.add(arr[i]);

        return hs.size();
    }
}
