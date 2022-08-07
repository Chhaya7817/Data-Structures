#include<iostream>
bool Power(int n)
{

    return (n!=0) && (n&(n-1))==0;
}
int main()
{
    int n;
    std::cout<<"Enter a number";
    std::cin>>n;
    bool b=Power(n);
    if(b==true)
        std::cout<<n<<" is power of Two..";
    else
        std::cout<<n <<" is not power of two";
    return 0;
}