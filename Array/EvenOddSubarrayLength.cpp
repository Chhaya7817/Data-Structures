//To find maximum length of even odd subarray in an array eg. [1 2 5 6 8 3]= 4
#include<iostream>
int maxLength(int arr[],int n)//Time Complexity o(n^2)
{
    int res_length=1;
    for(int i=0;i<n;i++)
    {
        int length=1;
        for(int j=i+1;j<n;j++)
        {
            if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
            {
                length++;
            }
            else
                break;
        }
        res_length=std::max(res_length,length);
    }
    return res_length;
}
//Efficient solution
int MaxOddEvenSubLength(int arr[],int n)//Time Complexity O(n)
{
    int res=1,curr=1;
    for(int j=1;j<n;j++)
    {
        if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
                curr++;
        else
            curr=1;
        res=std::max(res,curr);
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
    int l=maxLength(arr,n);
    std::cout<<"Maximum length of odd even subarray: "<<l<<"\n";
    int len=MaxOddEvenSubLength(arr,n);
    std::cout<<"Maximum length of odd even subarray: "<<len;
    return 0;
}