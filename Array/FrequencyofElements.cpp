#include<iostream>
void frequency(int arr[],int n)
{
    int count=1,ele=arr[0];
    for(int i=1;i<n;i++)
    {
        if(arr[i]==ele)
            count++;
        else
        {
            std::cout<<ele<<" "<<count<<"\n";
            ele=arr[i];
            count=1;
        }
    }
    std::cout<<ele<<" "<<count<<"\n";
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
    frequency(arr,n);
}