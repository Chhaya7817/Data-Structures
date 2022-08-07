//To find maximum difference(arr[j]-arr[i]) between elements of array where j>i
#include<iostream>
//Naive solution
int MaxDiff(int arr[],int n)   //time complexity theta(n^2)
{
    int res=arr[1]-arr[0];
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            res=std::max(res,arr[j]-arr[i]);
        }
    }
    return res;
}
//Efficient solution
int MaxDifference(int arr[],int n)  //timr complexity theta(n)
{
    int res=arr[1]-arr[0],min_val=arr[0];
    for(int i=0;i<n;i++)
    {
        res=std::max(res,arr[i]-min_val);
        min_val=std::min(min_val,arr[i]);
    }
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
    std::cout<<MaxDiff(arr,n);   //Naive solution
    std::cout<<MaxDifference(arr,n);  //Efficient solution
} 