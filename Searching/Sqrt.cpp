//Find Square root of the given number if it is not a perfect square then find the floor value of square root
#include<iostream>
int FloorSqrt(int x)
{
    int low=1,high =x,ans=-1;
    while(high>=low)
    {
        int mid=(high+low)/2;
        if(mid*mid==x)
            return mid;
        else if(mid*mid>x)
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
            ans=mid;
        }
    }
    return ans;
}
int main()
{
    int x;
    std::cout<<"enter Elemntto find square root : ";
    std::cin>>x;
    int ans=FloorSqrt(x);
    std::cout<<"Square root of "<<x<<"= "<<ans;
    return 0;

}