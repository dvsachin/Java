package leetCode.Easy;

public class CountingBits {
    public int[] countBits1(int n) {
        // TC = O(n*log n)
        int[] ans = new int[n+1];

        for (int i=0; i<n+1; i++) {
            int x = i;
            int count = 0;

            while (x > 0) {
                if(x % 2 == 1) count++;
                x = x /2;
            }
            ans[i] = count;
        }
        return ans;
    }

    public int[] countBits2(int n) {
        // TC = O(n)
        int[] dp = new int[n+1];
        int offset = 1;

        for (int i=1; i<n+1; i++) {
            if(offset*2 == i) offset = i;

            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
