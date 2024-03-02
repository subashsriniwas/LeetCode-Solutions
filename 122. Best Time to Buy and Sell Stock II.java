class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        int profit;
        Integer buy =null,sell=null;
        for(int i=0;i<prices.length;i++){
            if(buy!=null){
                profit = prices[i]-buy;
                if(profit>0){
                    total+=profit;
                }
                    buy=prices[i];
            }
            else{
                buy = prices[i];   // buy = prices[i];
            }
        }
        return total;
    }
}