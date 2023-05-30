package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountElementsGreaterThanX {
    public static int greaterThanX(int arr[], int n, int x){
        // Your code here
        int count = 0;

        for (int i=0; i<n; i++) {
            if(x < arr[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String[] str = read.readLine().split(" ");

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            int x = Integer.parseInt(read.readLine());

            System.out.println((new CountElementsGreaterThanX()).greaterThanX(arr,n,x));

        }
    }

}
