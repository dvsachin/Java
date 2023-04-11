import java.util.Scanner;
// Naive solution
public class CheckPrime {
    static boolean isPrime(int n) {
        if(n==1)
            return false;

        for(int i=2; i<n; i++) {
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
Time = O(n)
Space = O(1)
 */