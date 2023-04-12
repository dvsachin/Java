import java.util.Scanner;
// Using loop without using library
class FirstDigitOfANumber {

    public static int printFirst(int n){
        while(n>10){
            n=n/10;
        }
        return n;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.print(printFirst(n));
    }
}

