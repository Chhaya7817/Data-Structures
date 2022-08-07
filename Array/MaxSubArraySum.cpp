//Find Maximum Sum of subarray
#include<iostream>
int maxSubarray(int arr[],int n)    //time complexity o(n^2)
{
    int sum,res=arr[0];
    for(int i=0;i<n;i++)
    {
        sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            res=std::max(res,sum);
        }
    }
    return res;
}
int MaxSum(int arr[],int n) //Time Complexity O(n)
{
    int maxend=arr[0],res=arr[0];
    for(int i=1;i<n;i++)
    {
        maxend=std::max(arr[i],maxend+arr[i-1]);
        res=std::max(res,maxend);
    }
    return res;
}
int main()
{
    int n;
    std::cout<<"Enter size of array";
    std::cin>>n;
    int arr[n];
    //Enter binary elemnts
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    int res= maxSubarray(arr,n);
    std::cout<<"Maximum sum of subarray= "<<res;
    return 0;
}