/* given an unsorted arrayand a number x, we need to find if there is pair in the array with the sum = x   */
#include<iostream>
void getPointer(int arr[],int n,int x)
{
    int left=0,right=n-1;
    bool flag=false;
    while(left<right)
    {
        if(arr[left]+arr[right]==x)
        {
            flag=true;
            break;
        }
        else if(arr[left]+arr[right]>x)
        {
            right--;
        }
        else
            left++;

    }
    if(flag==true)
    {
        std::cout<<"The pair is:"<<arr[left]<<"  "<<arr[right];
    }
    else{
        std::cout<<"No such pair!!!";
    }
}
int main()
{
    int n;
    std::cout<<"Enter size of array: ";
    std::cin>>n;
    int arr[n],x;
    std::cout<<"Enter elements in array: ";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    std::cout<<"Enter a number: ";
    std::cin>>x;
    getPointer(arr,n,x);


}