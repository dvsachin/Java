package DataStructuresBasic.Sorting;

import java.util.Arrays;
// TC = Naive = O(m+n)*log(m+n) & SC = theta(m+n)
// TC = Efficient = O(m+n) & SC = theta(m+n)

public class UnionOfTwoSortedArrays {
    public static void main (String[] args)  {
        int a[] = new int[]{3,8,10};
        int b[] = new int[]{2,8,9,10,15};

        int m = a.length;
        int n = b.length;
        printUnionNaive(a,b,m,n);
        System.out.println();
        printUnionEfficient(a,b,m,n);

    }

    /*
    1. Create a new array size M+N and copy the elements from M and N arrays
    2. Sort the elements
    3. travers and print unique elements by comparing c[i]!=c[i-1]
     */
    static void printUnionNaive(int a[], int b[], int m, int n){


        int[] c = new int[m+n];

        for(int i=0;i<m;i++)
            c[i]=a[i];
        for(int i=0;i<n;i++)
            c[i+m]=b[i];

        Arrays.sort(c);

        for(int i=0;i<m+n;i++){
            if(i==0||c[i]!=c[i-1])
                System.out.print(c[i]+" ");
        }
    }

    /*
    Uses the merge function of mergeSort
    whoever is smaller than print it and move ahead it
    if both equal than print and move i and j
    To avoid duplicate element printing use
       i > 0 && j > 0
        a[i-1]==a[i]) than i++ and continue;
        b[j-1]==b[j]) than j++ and continue;

    if anyone array end than finish process or print the other array elements
     */
    static void printUnionEfficient(int a[], int b[], int m, int n){

        int i=0,j=0;
        while(i<m && j<n){
            // handling duplicates in first array
            if(i>0 && a[i-1]==a[i]){i++;continue;}
            // handling duplicates in second array
            if(j>0 && b[j-1]==b[j]){j++;continue;}

            if(a[i] < b[j]){System.out.print(a[i]+" "); i++;}

            else if(a[i] > b[j]){System.out.print(b[j]+" "); j++;}

            // both are equal
            else{System.out.print(a[i]+" "); i++; j++;}
        }

        while(i<m) { // b finished early
            if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" "); i++;}

        while(j<n){ // a finished early
            if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" "); j++;}
    }
}
