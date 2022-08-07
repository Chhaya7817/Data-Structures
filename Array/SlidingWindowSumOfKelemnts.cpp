//Given an array of integers and an element K , Find the maximum sum of K consecutive Elements in array
#include<iostream>
int Sum(int arr[],int n,int K)
{
    int Sum=0,res=0;
    for(int i=0;i<=n-K;i++)
    {
        Sum=0;
        for(int j=i;j<i+K;j++)
        {
            Sum+=arr[j];
        }
        res=std::max(res,Sum);

    }
    return res;

}
int main()
{
    int n,K;
    std::cout<<"Enter size of array and K";
    std::cin>>n>>K;
    int arr[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Max Sum= "<<Sum(arr,n,K);
}