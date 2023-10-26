package leetCode.Easy;

public class Sqrt_X_BinaryWay {
    public int mySqrt(int x) { // TC = O(log(n))
        // Binary or optimise way - to return a floor value of sqrt
        if (x == 0) return 0;
        int first = 1, last = x;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (mid == x / mid)
                return mid;
            else if (mid > x / mid)
                last = mid - 1;
            else
                first = mid + 1;
        }
        return last;
    }

}
// whenever we see such cases where
// till a certain point the answers are possible and
// after a certain point the answer is not possible
// Remember: we can always apply binary search

// DRY - RUN
// low = 1 (Min possible answer)  and high = N (Max possible answer) and Mid = (low + high)/2;
// N = 28 , low = 1, high = 28, mid = 14
// if 14*14 is > 28  => YES
// high = mid -1 or 13 ; and mid = (1+13)/2 = 7
// if 7*7 is > 28 => YES
// high = mid -1 or 6, mid = (1+6)/2 = 3
// if 3*3 > 28 => NO
// low = mid + 1 or 4, high = 6, mid = (4+6)/2 or 5
// if 5*5 is > 28 => NO
// low = mid + 1 or 5, high = 6, mid (5+6)/2 or 5;
// if 5*5 is > 28 => NO
// low = mid +1 or 6, high = 6, mid = 6 and
// if 6*6 is > 28 => YES
// high = mid -1 or 5, while(low <= high) condition false
// return high