package DataStructuresBasic.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {
    public static void main (String[] args) {
        int arr[] = new int[] {15, 16, 27, 27, 28, 15};
        int n = arr.length;

//        countFreqNaive(arr, n);
        countFreqEfficient(arr, n);
    }

    static void countFreqNaive(int arr[], int n) {  // TC=O(n^2) and SC=)(1)

        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                continue;

            int freq = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) freq++;
            }
            System.out.println(arr[i] + "---" + freq);
        }
    }

    static void countFreqEfficient(int arr[], int n) {  // TC=O(n) and SC=)(n)
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
                hmp.put(arr[i], 1);
        }

        for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
