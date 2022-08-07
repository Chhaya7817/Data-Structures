#include<iostream>
//Naive Solution
void MoveZeros(int arr[],int n)   //time complexity O(n^2)
{
    for(int i=0;i<n;i++)
    {
        if(arr[i]==0)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]!=0)
                {
                    arr[i]=arr[j];
                    arr[j]=0;
                    break;
                }
            }
        }
    }
    for(int i=0;i<n;i++)
    {
        std::cout<<arr[i]<<" ";
    }
}
//Efficient Solution
void MovezerosToEnd(int arr[],int n)   //time complexity O(n)
{
    int count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            std::swap(arr[i],arr[count++]);
        }
    }
    for(int i=0;i<n;i++)
    {
        std::cout<<arr[i]<<" ";
    }
}
//Main Function
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
    MovezerosToEnd(arr,n);
    MoveZeros(arr,n);
}