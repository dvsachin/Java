package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

 class DriverClass {
     public static void main(String[] args) throws IOException {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(read.readLine());

         while (t-- > 0) {
           String[] input = read.readLine().split(" ");
           int a = Integer.parseInt(input[0]);
           int b = Integer.parseInt((input[1]));
           System.out.println(Addition.add(a,b));
         }
     }
}

