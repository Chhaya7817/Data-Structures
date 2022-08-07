#include<iostream>
int No_Of_Set_Bits(int n)
{
    int count=0;
    while(n!=0)
    {
         n=n&n-1;
         count++;
    }
    return count;
   

}
int main()
{
    int n,count=0;
    std::cout<<"Enter a number ";
    std::cin>>n;
    count=No_Of_Set_Bits(n);
    std::cout<<"No. of Set Bits in "<<n<<" = "<<count;
    return 0;
}