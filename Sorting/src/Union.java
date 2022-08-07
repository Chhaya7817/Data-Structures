//Union of two sorted arrays
import java.util.Scanner;
public class Union {
    public static void union(int arr1[],int arr2[],int n1,int n2)
    {
        int i=0,j=0;
        while(i<n1 && j<n2)
        {

            if(i>0 && arr1[i]==arr1[i-1])   //this condition saves us from duplicates
            {
                i++;
                continue;
            }
            if(arr1[i]<arr2[j])
            {
                System.out.println(arr1[i++]);
            }
            else if(arr1[i]>arr2[j])
                System.out.println(arr2[j++]);
            else if(arr1[i]==arr2[j])   //Print same elements
            {
                System.out.println(arr1[i]);
                i++;j++;
            }
        }
        while(i<n1)
           System.out.println(arr1[i++]);
        
        while(j<n2)
            System.out.println(arr2[j++]);
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of 1st array:");
        int n1=sc.nextInt();
        System.out.println("Enter size of 2nd array:");
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        System.out.println("Enter 1st array: ");
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd array: ");
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        union(arr1, arr2, n1, n2);
    }
    
}
