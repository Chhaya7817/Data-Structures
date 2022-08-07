//Find String is Palindrom or not using Recursion
#include<iostream>
#include<string.h>
bool isPalindrome(char str[],int start,int end)
{
    if(start>=end)
        return true;
    return (str[start] == str[end]) && isPalindrome(str,start+1,end-1);
}
int main()
{
    char str[100];
    std::cout<<"Enter a String : ";
    std::cin>>str;
    bool result=isPalindrome(str,0,strlen(str)-1);
    if(result==true)
        std::cout<<str<<" is Palindrome";
    else
        std::cout<<str<<" is not Palindrome";
    return 0;

}