import java.util.Scanner;

public class InsertionSort {
    public void Insertion(int arr[])
    {
        int l=arr.length;
        for(int i=1;i<l;i++)
        {
            int temp=arr[i];
            int pos=i-1;
            while(pos>=0 && arr[pos]>temp)
            {
                arr[pos+1]=arr[pos];
                pos--;
            }
            arr[pos+1]=temp;
        }
    }
        static void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        InsertionSort obj=new InsertionSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        obj.Insertion(arr);
        printArray(arr);
        
    }
    
}
