package programming_Language.FlowControl_Loops_Functions;

import java.util.Scanner;

class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=Math.max(a,b);
        int y=a*b;
        int ans=x;
        for(int i=x;i<=y;i++){
            if(i%a==0 && i%b==0){
                ans=i;
                break;
            }
        }
        System.out.print(ans);
    }
}