import java.util.Scanner;

public class SumOfNaturnNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("Invalid Input");
            return;
        }

//        System.out.println("Sum of first natural number till "+number+" is :  "+ getSum(number));
        System.out.println("Sum of first natural number till "+number+" is :  "+ getSumUsingAP(number));



    }
    // Naive Solution - 0(n) Time and 0(1) space
    public static int getSum(int n) {
        int ans = 0;

        for(int i=1; i<= n; i++) {
            ans = ans + i;
        }

        return ans;
    }

    // Efficient Solution - Time 0(1), Time 0(1)
    public static int getSumUsingAP(int n) {
        return (n * (n+1)/2);
    }
}
