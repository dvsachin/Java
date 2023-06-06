package programming_Language.FlowControl_Loops_Functions;

import java.util.Scanner;

class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(n>0){
            i=i*n;
            n--;
        }
        System.out.print(i);
    }
}
