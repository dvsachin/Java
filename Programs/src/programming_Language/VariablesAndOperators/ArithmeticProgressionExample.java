package programming_Language.VariablesAndOperators;

import java.util.Scanner;

public class ArithmeticProgressionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTerm = scanner.nextInt();
        int difference = scanner.nextInt();
        int nTerm = scanner.nextInt();

        System.out.println("A.P : "+arithmeticProgression(firstTerm,difference,nTerm));

    }
    public static int arithmeticProgression(int a, int d, int n) {
        int ans = a + (n-1) * d;
        return ans;
    }
}
