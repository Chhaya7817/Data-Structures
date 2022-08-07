//Minimum group flips to make the binary array same
#include<iostream>
//Efficient solution
void printGroups(int arr[],int n)
{
    for(int i=1;i<n;i++)
    {
        if(arr[i]!=arr[i-1])
        {
            if(arr[i]!=arr[0])
            {
                std::cout<<"From "<<i<<" to ";
            }
            else
                std::cout<<i-1<<"\n";
        }
    }
    if(arr[n-1]!=arr[0])
        std::cout<<n-1<<"\n";
}
//Naive Solution
void countFlips(int arr[],int n)
{
    int count0=0,count1=0,start;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==1 &&arr[i+1]!=1)
            count1++;
        if(arr[i]==0 && arr[i+1]!=0)
            count0++;
        if(i+1==n-1 && arr[i]!=arr[i+1])
        {
            if(arr[i+1]==1)
                count1++;
            else    
                count0++;
        }
    }
    int flip=count0<count1?0:1;
      for(int i=0;i<n-1;i++)
    {
        if((i==0 && arr[i]==flip)||(arr[i]==flip && arr[i-1]!=flip))
            start=i;
        if((arr[i]==flip) && ((i+1==n-1 && arr[i+1]==flip) ||(arr[i+1]!=flip)))
        {
            std::cout<<start<<" to "<<i<<"\n";
        }
    }

}
int main()
{
    int n;
    std::cout<<"Enter size of array";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
   // countFlips(arr,n);
   printGroups(arr,n);
}