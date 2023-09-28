package geeksforgeeks.Easy_Level;
// https://practice.geeksforgeeks.org/problems/wave-array-1587115621/1
public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        // code here
        int temp = 0;

        for(int i=0; (i+1)<n; i+=2) {
            // swap
            temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;

        }
    }
}

