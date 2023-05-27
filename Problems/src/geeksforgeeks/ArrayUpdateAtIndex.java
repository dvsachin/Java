package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUpdateAtIndex {
    // Complete the function
    // arr[]: input array
    // index: input  index
    // element: element to be updated
    public static void updateArray(int arr[], int index, int element) {
        // Update the element at index
        arr[index] = element;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            int[] arr = new int[n];
            String[] str = read.readLine().split(" ");

            int index = 0, element = 0;
            index = Integer.parseInt(str[0]);
            element = Integer.parseInt(str[1]);


            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            ArrayUpdateAtIndex.updateArray(arr, index, element);
            System.out.println(arr[index]);

        }
    }
}


