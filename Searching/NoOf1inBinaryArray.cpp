//To count number of 1's in binary array in sorted array
#include<iostream>
int firstOccur(int arr[],int n,int x)
{
    int mid,low=0,high=n-1;
    while(low<=high)
    {
        mid=(high+low)/2;
        if(arr[mid]==0)
            low=mid+1;
        else
        {
            if(mid==0||arr[mid-1]==0)
                return mid;
            else
                high=mid-1;

        }
        
    }
    return -1;

}
int count1(int arr[],int n)
{
    int F=firstOccur(arr,n,1);
    if(F!=-1)
        return n-F;
    else
        return 0;


}
int main()
{
     int n,x;
    std::cout<<"Enter the size of array";
    std::cin>>n;
    int arr[n],first,last;
    std::cout<<"Enter Binary array (Sorted) Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Number of 1's in given binary array are: "<<count1(arr,n);
}