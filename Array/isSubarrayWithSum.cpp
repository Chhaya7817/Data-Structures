//Given an unsorted array with no-negative integers. Find if there is a subarray with given Sum
#include<iostream>
bool isSubarray(int arr[],int n,int sum)
{
    int cur_sum=0;
    for(int i=0;i<n;i++)
    {
        cur_sum+=arr[i];
        if(cur_sum==sum)
            return true;
        else if(cur_sum>sum)
        {
            for(int j=0;i<=i;j++)
            {
                cur_sum-=arr[j];
                if(cur_sum==sum)
                    return true;
                else if(cur_sum<sum)
                    break;
            }
        }
    }
    return false;
}
int main()
{
    int n,sum;
    std::cout<<"Enter size of array ";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter Sum :";
    std::cin>>sum;
    bool res=isSubarray(arr,n,sum);
    std::cout<<res;
}