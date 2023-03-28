import java.util.Scanner;
public class TableOfANumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int i=1;
        while (i<=m) {
            System.out.println(i*n);
            i=i+1;
        }
    }
}

// user will be given of number n and till m number (how many numbers)