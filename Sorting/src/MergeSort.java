//Sorting an array using merge sort
import java.util.Scanner;
public class MergeSort {
    public void merge(int arr[],int low,int mid,int high)
    {
        int n1=mid-low+1,n2=high-mid;
        // Setting up auxiliary arrays
        int left[]=new int[n1];
        int right[]=new int [n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[low+i];
        for(int i=0;i<n2;i++)
            right[i]=arr[mid+1+i];
        //Standard logic for merge Sort
        int i=0,j=0,k=low;
        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {    arr[k++]=left[i];
                i++;
            }
            else
            {
                arr[k++]=right[j];
                j++;
            }
            
        }
        while(i<n1)
        {    arr[k++]=left[i];
            i++;
        }
        while(j<n2)
        {
            arr[k++]=right[j];
            j++;
        }

    }
    public void mergeSort(int arr[],int l,int r)
    {
        if(r>l)
        {
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }

    }
    public void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        MergeSort obj=new MergeSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.mergeSort(arr, 0, n-1);
        obj.printArray(arr);


    }
}
