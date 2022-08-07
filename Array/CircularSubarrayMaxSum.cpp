#include<iostream>
int maxSum(int arr[],int n)
{
    int res=arr[0],sum=arr[0];
    for(int i=0;i<n;i++)
    {
        sum=0;
        for(int j=i;j<n;j++)
        {
            int index=(i+j)%n;
            sum+=arr[index];
            res=std::max(res,sum);

        }
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
    int res= maxSum(arr,n);
    std::cout<<"Maximum sum of subarray= "<<res;
    return 0;
}