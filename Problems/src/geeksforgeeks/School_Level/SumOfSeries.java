package geeksforgeeks.School_Level;

import geeksforgeeks.DataStrcutureBasics.Sorting.BinaryArraySorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfSeries {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0) {
            int n = Integer.parseInt(read.readLine().trim());
            System.out.println(new SumOfSeries().seriesSum(n));
        }
    }
    long seriesSum(int n) {
        // code here
        long sum = n;
        return (sum * (sum + 1))/2;
    }
}
