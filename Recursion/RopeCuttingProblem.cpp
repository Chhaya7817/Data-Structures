//Rope Cutting Problem ...size of rope(n), rope can be cut into a,b,c size of pieces....find max no. of pieces
#include<iostream>
int RopeCut(int n,int a,int b,int c)
{
    if(n==0)
        return 0;
    if(n<0)
        return -1;
    int result=std::max(RopeCut(n-a,a,b,c),RopeCut(n-b,a,b,c),RopeCut(n-c,a,b,c));
    if(result=-1)
        return -1;
    return result+1;

}
int main()
{
    int n,a,b,c;
    std::cout<<"Enter values";
    std::cin>>n>>a>>b>>c;
    int result=RopeCut(n,a,b,c);
    if(result==-1)
        std::cout<<"Rope cannot cut into exact no. of pieces...";
    else
        std::cout<<"Rope can cut into maximum "<<result<<"no. of pieces...";

}