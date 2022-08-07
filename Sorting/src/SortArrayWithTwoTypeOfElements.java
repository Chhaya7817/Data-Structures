//Sort an array with two type of elements
import java.util.Scanner;
public class SortArrayWithTwoTypeOfElements {
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Segregate negative and positive lements
    public static void segNegPos(int arr[],int n)
    {
        int i=-1,j=n;
        while(true)
        {
        do{
            i++;
        }while(arr[i]<0);
        do{
            j--;
        }while(arr[j]>=0);
        if(i>=j)
            return;
        swap(arr, i, j);
    }
 
    }
    //Segregate even odd array
    public static void segEvenOdd(int arr[],int n)
    {
        int i=-1,j=n;
        while(true)
        {
            do{
                i++;
            }while(arr[i]%2==0);
            do{
                j--;
            }while(arr[j]%2!=0);
            if(i>=j)
                return;
            else
                swap(arr,i,j);
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
       // segNegPos(arr,n);
       segEvenOdd(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
