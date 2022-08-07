#include<iostream>
int Sum_of_Digits(long long int n)
{
    if(n==0)
        return 0;
    return (n%10) + Sum_of_Digits(n/10);

}
int main()
{
    long long int n;
    std::cout<<"Enter a number :";
    std::cin>>n;
    int sum=Sum_of_Digits(n);
    std::cout<<"Sum of Digits of "<<n<<" = "<<sum;
    return 0;
}