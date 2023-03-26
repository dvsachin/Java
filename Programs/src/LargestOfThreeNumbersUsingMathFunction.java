import java.util.Scanner;

public class LargestOfThreeNumbersUsingMathFunction {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans_1=Math.max(a,b);
        int ans=Math.max(ans_1,c);
        System.out.print(ans);
    }
}
