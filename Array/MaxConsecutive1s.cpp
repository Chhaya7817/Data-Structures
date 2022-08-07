//Find Maximum number of consecutive 1's in binary array
#include<iostream>
int getmax(bool arr[],int n)
{
    int count=0,cur_count=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]==0)
            cur_count=0;
        else
        {
            cur_count++;
            count=std::max(count,cur_count);
        }
    }
    return count;
}
int main()
{
    int n;
    std::cout<<"Enter size of array";
    std::cin>>n;
    bool arr[n];
    //Enter binary elemnts
    std::cout<<"Enter Elements(0 or 1)";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    int count=getmax(arr,n);
    std::cout<<"Maximum no. of consecutive 1's= "<<count;
    return 0;
}
