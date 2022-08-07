#include<iostream>
int Sum_Natural_Numbers(int n)
{
    if(n==1)
        return 1;
    return n+Sum_Natural_Numbers(n-1);
}
int main()
{
    int n;
    std::cout<<"Enter a number to which you want to find sum:";
    std::cin>>n;
    int sum=Sum_Natural_Numbers(n);
    std::cout<<"Sum= "<<sum;
    return 0;
}