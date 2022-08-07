#include<iostream>
void LeftRotate(int arr[],int n,int D)    //time complexity theta n , auxiliary space constant 1
{
    while(D--)
    {
    int temp=arr[0];
    for(int i=0;i<n-1;i++)
    {
        arr[i]=arr[i+1];

    }
    arr[n-1]=temp;
    }
    for(int i=0;i<n;i++)
    {
        std::cout<<arr[i]<<" ";
    }
}
void LeftRotateD(int arr[],int n,int D){
    int temp[D];
    for(int i=0;i<D;i++)
    {
        temp[i]=arr[i];
    }
    for(int i=D;i<n;i++)
    {
        arr[i-D]=arr[i];
    }
    for(int i=0;i<D;i++)
    {
        arr[i+D-1]=temp[i];
    }
    for(int i=0;i<n;i++)
    {
        std::cout<<arr[i]<<" ";
    }
}
int main()
{
    int n,D;
    std::cout<<"Enter size";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter how many times u want to rotate left: ";
    std::cin>>D;
    LeftRotateD(arr,n,D);
}