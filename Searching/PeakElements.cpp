// elements are not smaller than its neighbouring elements
#include<iostream>
//Naive method
void peak(int arr[],int n)            //Time Complexity O(n)
{
    if(arr[0]>arr[1])
        std::cout<<arr[0]<<" ";
    if(arr[n-1]>arr[n-2])
        std::cout<<arr[n-1]<<" ";
    for(int i=1;i<n-1;i++)
    {
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            std::cout<<arr[i]<<" ";
    }
}
//efficient solution
int BinaryPeak(int arr[],int n)
{
    int high=n-1,low=0;
    
    while(low<=high)
    {
        int mid=(high+low)/2;
        if((mid==0||arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1]))
            return arr[mid];
        else if(arr[mid-1]>=arr[mid] && mid>0)
            high=mid-1;
        else if(arr[mid+1]>=arr[mid] && mid<n-1)
            low=mid+1;
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
   // peak(arr,n);
   int k=BinaryPeak(arr,n);
   std::cout<<k;
}