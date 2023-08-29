package leetCode.Medium;

// https://leetcode.com/problems/minimum-penalty-for-a-shop/

public class MinimumPenaltyForAShop {
    public int bestClosingTime(String customers) {
        int n = customers.length();

        // count of all Y,N from 0 index to i
        int[] YCount = new int[n];
        int[] NCount = new int[n];

        // base case
        YCount[0] = customers.charAt(0) == 'Y' ? 1 : 0;
        NCount[0] = customers.charAt(0) == 'N' ? 1 : 0;


        for(int i=1; i<n; i++) {
            YCount[i] +=  YCount[i-1];
            NCount[i] +=  NCount[i-1];

            if(customers.charAt(i) == 'Y')
                YCount[i]++;
            else
                NCount[i]++;
        }

        int min_penalty = Integer.MAX_VALUE, min_penalty_Index = 0;

        for(int i=0; i<=n; i++) {
            /* if the shop closes at ith hour */
            // before and after penalty
            int B_penalty = 0, A_penalty = 0, totalPenalty = 0;
            B_penalty = (i>0) ? NCount[i-1] : 0;
            A_penalty = (i<n) ? ( YCount[n-1] - ((i>0)? YCount[i-1] :0)) : 0;
            totalPenalty = B_penalty + A_penalty;

            if(min_penalty > totalPenalty) {
                min_penalty = totalPenalty;
                min_penalty_Index = i;
            }
        }

        return min_penalty_Index;

    }
}
