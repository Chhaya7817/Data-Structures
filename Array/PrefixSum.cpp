//Given a fixed array with multiple queries of following types on array find the prefix sum
#include<iostream>
int getSum(int arr[],int n,int f,int l)
{
    int pre_Sum[n];
    pre_Sum[0]=arr[0];
    for(int i=1;i<n;i++)
    {
        pre_Sum[i]=pre_Sum[i-1]+arr[i];
    }
    if(f==0)
        return pre_Sum[0];
    else
        return pre_Sum[l]-pre_Sum[f-1];

}
int main()
{
    int n;
    std::cout<<"Enter the size of array";
    std::cin>>n;
    int arr[n],first,last;
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter first and last index to get the sum:";
    std::cin>>first>>last;
    int result=getSum(arr,n,first,last);
    std::cout<<"Result="<<result;
    return 0;
}