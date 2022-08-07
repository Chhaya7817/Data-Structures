import java.util.Scanner;

//Partitioning a given array such that elements at the left of given index elemnt are lesser whuile on the right elements are greater than the index element 
public class PartitionArray {
    public static void partitionNaive(int arr[],int index)
    {
        int n=arr.length,k=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=arr[index])
                temp[k++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[index])
                temp[k++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }
    static void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter an index: ");
        int index=sc.nextInt();
        partitionNaive(arr, index);
        printArray(arr);

    }
    
}
