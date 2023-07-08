package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompeteTheSkills {
    static long ca=0, cb=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0) {
            int n=3;
            long[] a = new long[n];
            long[] b = new long[n];

            String[] input1 = br.readLine().trim().split(" ");
            for (int i=0; i<n; i++)
                a[i] = Long.parseLong(input1[i]);

            String[] input2 = br.readLine().trim().split(" ");
            for (int i=0; i<n; i++)
                b[i] = Long.parseLong(input2[i]);

            new CompeteTheSkills().scores(a,b);
            System.out.println(ca+" "+cb);
        }
    }
    public void scores(long a[], long b[]) {
        // Your code goes here
        ca=0;
        cb=0;

        for(int i=0; i<a.length && i<b.length; i++) {
            if(a[i] == b[i]) continue;

            if(a[i]>b[i])
                ca++;
            else
                cb++;
        }

    }
}
