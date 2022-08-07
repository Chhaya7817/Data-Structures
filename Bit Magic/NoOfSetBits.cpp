#include<iostream>
int main()
{
    int n,count=0;
    std::cout<<"Enter a number ";
    std::cin>>n;
    while(n!=0)
    {
        if(n & 1==1)
            count++;
        n=n>>1;
    }
    std::cout<<"No. of Set Bits  =  "<<count;
    return 0;
}