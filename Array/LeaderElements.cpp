//Find leaders in an gven array (Problem ) 
#include<iostream>
//Naive solution
void LeaderElement(int arr[],int n)    //time complexity theta(n^2)
{
    for(int i=0;i<n;i++)
    {
        int flag=0;
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]<=arr[j])
            {
                flag=-1;
                break;
            }
        }
        if(flag==0)
        std::cout<<arr[i]<<" ";
    }
}

//Efficient solution
void LeaderElements(int arr[],int n)         //time complexity theta(n)
{
    int cur_ldr=arr[n-1];
    std::cout<<cur_ldr<<" ";
    for(int i=n-2;i>=0;i--)
    {
        if(arr[i]>cur_ldr)
        {
            cur_ldr=arr[i];
            std::cout<<cur_ldr<<" ";
        }
    }

}
int main()
{
    int n;
    std::cout<<"Enter size of array";
    std::cin>>n;
    int arr[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>arr[i];
    }
    LeaderElement(arr,n);  //Naive solution
    LeaderElements(arr,n);   //efficient solution
}