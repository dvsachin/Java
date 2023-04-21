package FlowControl_Loops_Functions;

import java.util.*;
// Efficient Code
class CheckPrime2 {
    static boolean isPrime(int n) {
        if(n == 1)
            return false;

        for(int i=2; i*i <= n; i++) {
            if(n % i == 0)
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
Idea: Divisors always appear in pair
    If (x,y) is a pair
       x * y = n
       And if x <= y
       x * x <= n
       x <= square root(n)
 */

/*
If a divisor greater than square root(n) then that divisor have a pair which is <= square root(n)
so iterate 2 to square root(n)
 */

/*
Time = O(square root(n))
Space = O(1)
 */