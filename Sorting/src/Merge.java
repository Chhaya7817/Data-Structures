//program to merge two given sorted arrays
import java.util.Scanner;
public class Merge {
    public void merge(int a[],int b[],int m,int n)
    {
        int c[]=new int[m+n];
        int i,j,k=0;
        for(i=0,j=0;j<n&&i<m;)
        {
            if(a[i]<=b[j])
            {
                c[k++]=a[i];
                i++;
            }
            else
            {
                c[k++]=b[j];
                j++;
            }
        }
        while(i<m)
        {
            c[k++]=a[i];
            i++;
        }
        while(j<n)
        {
            c[k++]=b[j];
            j++;
        }
        for(i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
    public static void main(String[] args) {
        Merge obj=new Merge();
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[m];
        int b[]=new int[n];
        for(int i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        obj.merge(a,b,m,n);
    }
    
}
