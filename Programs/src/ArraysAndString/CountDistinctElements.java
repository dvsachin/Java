package ArraysAndString;

import java.util.Scanner;

public class CountDistinctElements {
    public static int countDigits(int[] a,int n){
        int count=0;boolean isDistinct=true;
        for(int i=0;i<n;i++){ // for all the elements
            for(int j=i-1;j>=0;j--){ // it will check current element duplicate  from  current index -1 to till 0th index
                if(a[i]==a[j]){
                    isDistinct=false; // fount the duplicate then isDistinct false
                    break;
                }
            }
            if(isDistinct==true){
                count++;
            }
            isDistinct=true;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.print(countDigits(a,n));
    }
}
/*
5
10 20 30 10 20

output: 3
 */

// here only 3 elements are distinct: 10, 20, 30