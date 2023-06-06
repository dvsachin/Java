package programming_Language.ArraysAndString;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    public static boolean isSorted(int[] a,int n){

        if(n == 1 || n == 0) return true; // if array contains 1 element or its empty then also array is sorted

        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){ //sorted array: check current element should be greater than previous element if not then return false
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean ans=isSorted(a,n);
        if(ans==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
/*
3
10 20 5

output: No
 */