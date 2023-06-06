package programming_Language.FlowControl_Loops_Functions;

import java.io.IOException;
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.print(a);
        }else if(b>=a && b>=c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
    }
}
