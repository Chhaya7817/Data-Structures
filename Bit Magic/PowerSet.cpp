//Program to find all subsets of the given string
#include<iostream>
#include<math.h>
#include<string.h>
void PowerSet(char str[])
{
    int l=strlen(str),n=pow(2,l);
    for(int count=0;count<n;count++)
    {
      //  std::cout<<count;
        for(int j=0;j<l;j++)
        {
            if((count & (1<<j))!=0)
                std::cout<<str[j];
        }
        std::cout<<"\n";
    }

}
int main()
{
    char str[100];
    std::cin>>str;
    PowerSet(str);
    return 0;
}