import java.util.Scanner;

public class DSelection {
    public static void Selection(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int max=arr[i];
            int pos=i;
            //Comparision Loop
            for(int j=i+1;j<n;j++)
            {
                if(max<arr[j])
                {
                    max=arr[j];
                    pos=j;
                }
            }
            if(pos!=i)
            {
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
            }
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Selection(arr);
        printArray(arr);
        
    }

}
