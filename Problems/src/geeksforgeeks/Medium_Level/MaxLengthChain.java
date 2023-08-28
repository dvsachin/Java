package geeksforgeeks.Medium_Level;

import java.util.Arrays;
import java.util.Comparator;

class Pair {
    int x;
    int y;

    public Pair(int a, int b) {
        x = a;
        y = b;
    }
}
public class MaxLengthChain {
    int maxChainLength(Pair arr[], int n) {
        // your code here

        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair first, Pair second)  {
                return Integer.valueOf(first.y).compareTo(Integer.valueOf(second.y));
            }
        });

        int i=0, j=1, count=1, len = arr.length;

        while (j < len) {
            if(arr[i].y < arr[j].x) {
                count++;
                i=j;
                j++;
            }
            else j++;
        }
        return count;
    }
}
