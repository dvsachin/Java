package geeksforgeeks;

import java.util.Scanner;

public class JavaExceptionFindMin {
    private int a;
    private int b;

    JavaExceptionFindMin(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void findMin() {
        Integer minimum = Integer.MAX_VALUE;

        try {
            minimum = Math.min(minimum, (a+b));
            minimum = Math.min(minimum, (a-b));
            minimum = Math.min(minimum, (a*b));
            minimum = Math.min(minimum, (a/b));

            System.out.println(minimum);
        }
        catch(Exception e) {  System.out.println(minimum); }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
          int a = sc.nextInt();
          int b = sc.nextInt();

          JavaExceptionFindMin obj = new JavaExceptionFindMin(a,b);
          obj.findMin();

        }
    }
}
