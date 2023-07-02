package DataStructuresBasic.Sorting;
// TC = Naive = Theta(n^2)
// TC = Efficient = O(n + m)

public class IntersectionOfTwoSortedArrays {
    public static void main (String[] args)
    {
        int a[] = new int[]{3,5,10,10,10,15,15,20};
        int b[] = new int[]{5,10,10,15,30};

        int m = a.length;
        int n = b.length;
        intersectionNaive(a,b,m,n);
        System.out.println();
        intersectionEfficient(a,b,m,n);

    }

    static void intersectionNaive(int a[], int b[], int m, int n){
        // works for any array (sorted / unsorted)
        for(int i=0;i<m;i++){
            if(i>0 && a[i-1]==a[i]) continue;

            for(int j=0;j<n;j++)
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
        }
    }
    static void intersectionEfficient(int a[], int b[], int m, int n){
        // used merge function of mergeSort
        int i=0,j=0;

        while(i < m && j < n){
            if(i>0 && a[i-1] == a[i]){ // to avoid process duplicates
                i++;
                continue;
            }
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }
    }
}
