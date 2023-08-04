package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EvenOddSum {
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int even=0, odd=0;
        for(int i=0; i<N; i++) {
            if(i%2==0) even += Arr[i];
            else odd += Arr[i];
        }
        ans.add(even);
        ans.add(odd);

        return ans;

    }

    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine().trim());

        while (t-- > 0) {
            int N = Integer.parseInt(reader.readLine());
            int[] Arr = new int[N];
            String[] ip = reader.readLine().split(" ");
            for(int i=0; i<N;i++) {
                Arr[i] = Integer.parseInt(ip[i]);
            }
            EvenOddSum evenOddSum = new EvenOddSum();
            ArrayList<Integer> ans = evenOddSum.EvenOddSum(N,Arr);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
