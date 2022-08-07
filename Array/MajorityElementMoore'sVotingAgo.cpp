#include<iostream>
//Moore's Voting Algorithm
int MaxElement(int arr[],int n)
{
    int res=0,count=1;
    for(int i=1;i<n;i++)
    {
        if(arr[res]==arr[i])
            count++;
        else
            count--;
        if(count==0)
        {
            res=i;
            count=1;
        }
    }
    return res;
}
int checkMajority(int arr[],int n)
{
    int res=MaxElement(arr,n);
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[res]==arr[i])
            count++;
    }
    if(count<=n/2)
        res=-1;
    return res;

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
    int res=checkMajority(arr,n);//Overall time complexity = O(n) + O(n)=O(n)
    std::cout<<"Majority Element is : "<<arr[res];
    return 0;
}