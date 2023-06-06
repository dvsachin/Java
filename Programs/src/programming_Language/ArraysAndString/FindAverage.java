package programming_Language.ArraysAndString;

import java.util.Scanner;

public class FindAverage {
    public static double average(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        double avg=sum/a.length;
        return avg;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print(average(a));
    }
}
