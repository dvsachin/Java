package FlowControl_Loops_Functions;

import java.util.*;
// More Efficient Code(for large numbers)
class CheckPrime3 {
    static boolean isPrime(int n) {
        if(n==1)
            return false;

        if(n==2 || n==3)
            return true;

        if(n%2==0 || n%3==0)
            return false;

        for(int i=5; i*i<=n; i=i+6) {
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(isPrime(number));

    }
}
/*
square root(1031) = 32.10
Eg: n = 1031   => 6 times the loop condition check
    i = 5
    i = 11
    i = 17
    i = 23
    i = 29
    i = 35 loop condition false
    35*35 <= 1031

    Instead of running loop till square root(n) which is 32 times, we just run 5 times with
    6x more efficient
 */

/*
Time = O(square root(n))
Space = O(1)
 */
