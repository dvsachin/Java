package DataStructuresBasic.Sorting;

public class TailCallEliminationInQuickSort {
    /**
     * Quicksort tail call optimization in C by programmer but in Java it automatically by JIT compiler
     */
    /*
    #include <stdio.h>
int partition(int arr[], int l, int h)
{
    int pivot=arr[l];
    int i=l-1,j=h+1;

    int num=1;
    while(num>0){
        do{
            i++;
        }while(arr[i]<pivot);
        do{
            j--;
        }while(arr[j]>pivot);
        if(i>=j)return j;

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

void qSort(int arr[],int l,int h){
    Begin:
    if(l<h){
        int p=partition(arr,l,h);
        qSort(arr,l,p);
        l=p+1;
        goto Begin;
    }
}

int main() {

    int arr[]={8,4,7,9,3,10,5};

	int n=sizeof(arr)/sizeof(arr[0]);

	qSort(arr,0,n-1);

	for(int i=0;i<n;i++)
	    printf("%d ",arr[i]);
}
     */
}
