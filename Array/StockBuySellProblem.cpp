/* we know prices of stocks for upcoming n days
  we can buy stock on any day and sell on any upcoming day. Maximise the profit*/
#include<iostream>
int getMaximumProfit(int price[],int start,int end)
{
  int profit=0,cur_profit=0;
  if(end<=start)
  return 0;
  std::cout<<"Maximum profit = "<<profit;
  for(int i=0;i<end;i++)
  {
    for(int j=i+1;j<=end;j++)
    {
      if(price[j]>price[i])
      {
        cur_profit=price[j]-price[i]+getMaximumProfit(price,start,i-1)+getMaximumProfit(price,j+1,end);
        profit=std::max(profit,cur_profit);
        std::cout<<"Maximum profit = "<<profit;
      }
    }
  }
  return profit;
}
int main()
{
    int n;
    std::cout<<"Enter size of array";
    std::cin>>n;
    int price[n];
    std::cout<<"Enter Elements";
    for(int i=0;i<n;i++)
    {
        std::cin>>price[i];
    }
    int profit=getMaximumProfit(price,0,n-1);
    std::cout<<"Maximum profit = "<<profit;

}