package geeksforgeeks;

import java.util.Arrays;
import java.util.Scanner;

public class StreamsMax {
    public static int maxUsingStreams(int []arr) {
        //Your code here
        //Use stream().max().getAsInt()

        int max = Arrays.stream(arr).max().getAsInt();

        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(maxUsingStreams(arr));
        }
    }
}
