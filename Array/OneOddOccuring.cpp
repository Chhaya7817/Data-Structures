//Program to find one odd times occuring elements in a given array

#include<iostream>
int main()
{
    int n,result;
    std::cout<<"Enter Size of array: ";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter Elements in array\n NOTE: only one element occur odd times....";

    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    result=arr[0];
    for(int i=1;i<n;i++)
    {
        result=result ^arr[i];
    }
    std::cout<<"Number Occuring Odd times = "<<result;
    return 0;
}