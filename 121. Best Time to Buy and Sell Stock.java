class Solution {
    public int maxProfit(int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;

        for (int i=0; i<prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            
        }
        return maxProfit;
    }
}