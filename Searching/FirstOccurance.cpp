//Program to find the first occurance of the given element
#include<iostream>
//Recursive Method
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
//Iterative Solution
int firstOccur(int arr[],int n,int x)
{
    int mid,low=0,high=n-1;
    while(low<=high)
    {
        mid=(high+low)/2;
        if(arr[mid]>x)
            high=mid-1;
        else if(arr[mid]<x)
            low=mid+1;
        else
        {
            if(mid==0||arr[mid]!=arr[mid-1])
                return mid;
            else
                high=mid-1;

        }
        
    }

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
    std::cout<<"Element found at index : "<<FirstOccurance(arr,n,x,0,n-1);
    std::cout<<"\nElement found at index : "<<firstOccur(arr,n,x);


}