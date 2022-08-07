#include<iostream>
void LeftRotate(int arr[],int n)    //time complexity theta n , auxiliary space constant 1
{
    int temp=arr[0];
    for(int i=0;i<n-1;i++)
    {
        arr[i]=arr[i+1];

    }
    arr[n-1]=temp;
    for(int i=0;i<n;i++)
    {
        std::cout<<arr[i]<<" ";
    }
}
int main()
{
    int n;
    std::cout<<"Enter size";
    std::cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    LeftRotate(arr,n);
}