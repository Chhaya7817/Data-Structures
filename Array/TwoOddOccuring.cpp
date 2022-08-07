//Program to find two odd times occuring elements in a given array
#include<iostream>
void TwoOddOccuring(int arr[],int n)
{
    int res1=0,res2=0,xo=0;
    for(int i=0;i<n;i++)
        xo=xo^arr[i];
    int k=xo & ~(xo-1);
    for(int i=0;i<n;i++)
    {
        if((arr[i]&k)!=0)
            res1=res1^arr[i];
        else
            res2=res2^arr[i];
    }
    std::cout<<"Two odd times occuring elements in array are::"<<res1<<" "<<res2;
}
int main()
{
    int n;
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter elements in array:";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    TwoOddOccuring(arr,n);
}