import java.util.Scanner;

public class GeometricExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTerm = scanner.nextInt();
        int commonRatio = scanner.nextInt();
        int nthTerm = scanner.nextInt();

        System.out.println("GP : "+geometricProgression(firstTerm,commonRatio,nthTerm));
    }
    public static int geometricProgression(int a, int r, int n) {
        int ans = (int) (a * Math.pow(r, n-1));
        return ans;
    }
}
