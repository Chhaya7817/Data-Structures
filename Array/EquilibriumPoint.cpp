#include<iostream>
int getEqui(int arr[],int n)
{
    int sum=0,r_sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    for(int i=0;i<n;i++)
    {
        if(r_sum==sum-arr[i])
            return arr[i];
        r_sum+=arr[i];
        sum-=arr[i];
    }
    return -1;
}
int getEquilibrium(int arr[],int n)
{
    int pre_Sum[n];
    pre_Sum[0]=arr[0];
    for(int i=1;i<n;i++)
    {
        pre_Sum[i]=pre_Sum[i-1]+arr[i];
    }
    for(int i=1;i<n;i++)
    {
        if(pre_Sum[i-1]==pre_Sum[n-1]-pre_Sum[i])
            return arr[i];
    }
    return -1;

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
    //int equi=getEquilibrium(arr,n);
    int equi=getEqui(arr,n);

    std::cout<<"Equilibrium point= "<<equi;
    return 0;

}