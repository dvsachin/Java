package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class AverageInAStream {
    float[] streamAvg(int[] arr, int n) {
        // code here
        float[] stream = new float[n];
        float sum = 0.0f;
        for (int i=0; i<n; i++) {
            sum = sum + arr[i];
            stream[i] = sum / (i+1);

        }
        return stream;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- >0) {
            int n = Integer.parseInt(reader.readLine().trim());
            int[] arr = new int[n];

            String[] input = reader.readLine().trim().split(" ");
            for (int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            float[] ans = new AverageInAStream().streamAvg(arr,n);
            for (int i=0; i<n; i++) {
                DecimalFormat df = new DecimalFormat("#.##");
                String formatted1 = df.format(ans[i]);
                String formatted2 = String.format("%.2f",ans[i]);

                if (formatted1.length() >= 3 && formatted1.charAt(formatted1.length()-3) == '.')
                    System.out.print(formatted1+" ");
                else
                    System.out.print(formatted2+" ");
            }
            System.out.println();
        }
    }
}
/*
Given a stream of incoming numbers, find average or mean of the stream at every point.



Example 1:

Input:
n = 5
arr[] = {10, 20, 30, 40, 50}
Output: 10.00 15.00 20.00 25.00 30.00
Explanation:
10 / 1 = 10.00
(10 + 20) / 2 = 15.00
(10 + 20 + 30) / 3 = 20.00
And so on.


Example 2:

Input:
n = 2
arr[] = {12, 2}
Output: 12.00 7.00
Explanation:
12 / 1 = 12.00
(12 + 2) / 2 = 7.00


Your Task:
You don't need to read input or print anything. Your task is to complete the function streamAvg() which takes the array of integers arr and n as input parameters and returns an array of type float denoting the average at every point in the stream.



Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)



Constraints:
1 ≤ n ≤ 105
1 ≤ arr[i] ≤ 106
 */
