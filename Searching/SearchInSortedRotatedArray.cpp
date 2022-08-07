// search an element in a sorted rotated array
#include<iostream>
int BinarySearch(int arr[],int n,int x)
{
    int mid,low=0,high=n-1;
    while(low<=high)
    {
        mid=(low+high)/2;
        if(arr[mid]==x)
            return mid;
        if(arr[low]<arr[mid])
        {
            if(x>=arr[low] && x<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        else
        {
            if(x>arr[mid] && x<=arr[high])
                low=mid+1;
            else
                high=mid-1;
        }
    }
    return -1;
}
int main()
{
    int n;
    std::cout<<"Enter size of array: ";
    std::cin>>n;
    int arr[n],x;
    std::cout<<"Enter sorted rotated array : ";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter element to search:";
    std::cin>>x;
    std::cout<<x<<" Found at index :"<<BinarySearch(arr,n,x);
    return 0;
}