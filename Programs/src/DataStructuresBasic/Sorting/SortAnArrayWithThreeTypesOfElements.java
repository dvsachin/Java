package DataStructuresBasic.Sorting;

public class SortAnArrayWithThreeTypesOfElements {
    /**
     * Questions asked in types:
     *      1. Sort an array of 0's, 1's, 2's (0,..,1...,2..)
     *      2. Three way Partitioning such that all occurrence of pivot come together with pivot given
     *      3. Partition around a range with given range [5,10] means
     *         elements < 5 <= elements <= 10 > elements
     */

// TC = Naive = O(n) + O(n) + O(n) + O(n) - 4 traversals & SC = O(n)
// TC = Efficient =  Θ(n) - 1 traversal & SC = Θ(1)
    public static void main (String[] args) {
        int arr[] = new int[]{0,1,1,2,0,1,1,2};

        int n = arr.length;

        sortNaive(arr,n);
        sortEfficient(arr,n);


        for(int x:arr)
            System.out.print(x+" ");

    }

    static void sortNaive(int arr[],int n){

        int[] temp = new int[n];
        int i=0;

        for(int j=0;j<n;j++) // put all 0,s at first
            if(arr[j]==0)
                temp[i++]=arr[j];

        for(int j=0;j<n;j++) // put all 1,s after 0's
            if(arr[j]==1)
                temp[i++]=arr[j];

        for(int k=0;k<n;k++)  // put all 2,s after 0's and 1's
            if(arr[k]==2)
                temp[i++]=arr[k];

        for(int j=0;j<n;j++) // copy temp array into original array
            arr[j]=temp[j];
    }

    static void sortEfficient(int arr[],int n){
        // Dutch National flag algorithm - variation of Hoare's partition
        // taken 3 windows low mid and high where 0 to low are 0's, low to mid 1's and h to n-1 are 2's
        // https://practice.geeksforgeeks.org/batch/cip-1/track/DSA-Foundation-Sorting/video/OTk2
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;

                    l++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    //swapping arr[h] & arr[mid])
                    temp = arr[h];
                    arr[h] = arr[mid];
                    arr[mid] = temp;

                    h--;
                    break;
            }
        }

    }
}
