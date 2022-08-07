#include<iostream>
int FirstOccurance(int arr[],int n,int x,int low,int high)
{
    int mid=(low+high)/2;
    if(low>high)
        return -1;
    else if(x>arr[mid])
        FirstOccurance(arr,n,x,mid+1,high);
    else if(x<arr[mid])
        FirstOccurance(arr,n,x,low,mid-1);
    else
    {
        if(mid==0 || arr[mid]!=arr[mid-1])
            return mid;
        else
            FirstOccurance(arr,n,x,low,mid-1); 
    }

}
int count(int arr[],int n,int x)
{
    int count=0;
    int Findex=FirstOccurance(arr,n,x,0,n-1);
    if(Findex!=-1)
    {
    for(int i=Findex;i<n;i++)
    {
        if(arr[i]!=x)
            break;
        count++;
        
    }

    }
    return count;
}
int main()
{
     int n,x;
    std::cout<<"Enter the size of array";
    std::cin>>n;
    int arr[n],first,last;
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter Element to search:";
    std::cin>>x;
    int c=count(arr,n,x);
    std::cout<<x<<" occurs "<<c<<" times.";
}