import java.util.Scanner;

public class LastdigitOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(getLastDigit(number));
    }
    public static int getLastDigit(int number) {
        return Math.abs(number%10);
    }
}
