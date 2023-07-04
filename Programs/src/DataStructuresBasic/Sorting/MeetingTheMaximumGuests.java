package DataStructuresBasic.Sorting;

import java.util.Arrays;

public interface MeetingTheMaximumGuests {
    public static void main (String[] args) {
        int arr[] = { 900, 600, 700};
        int dep[] = { 1000, 800, 730};
        int n = arr.length;

        System.out.print(maxGuest(arr,dep, n));

    }

    // TC = O(n*logg n) +  O(n*logg n) +  O(n + n) =>  O(n*logg n)
    static int maxGuest(int arr[],int dep[],int n) {
        Arrays.sort(arr); // sort arrival time
        Arrays.sort(dep); // sort departure time
//        O(n*logg n) +  O(n*logg n)

        int i=1,j=0,res=1,curr=1;
        while(i<n && j<n){ //  O(n + n)
            if(arr[i]<dep[j]){
                curr++;i++;
            }
            else{
                curr--;j++;
            }
            res=Math.max(curr,res);
        }
        return res;
    }
}

