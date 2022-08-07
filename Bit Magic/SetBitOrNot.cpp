// Program to check kth bit is set or not from last
#include<iostream>
int main()
{
    int n,k;
    std::cout<<"Eneter a number ";
    std::cin>>n;
    std::cout<<"Enter position for which u want to find set/not set from last ";
    std::cin>>k;
    if(n>>(k-1) & 1 ==1)
        std::cout<<"Set!! ";
    else    
        std::cout<<"Not Set!!!";

}