package org.nielsen.bestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int diff = 0;
        for (int i = 1; i < prices.length; i ++) {
            int profit = prices[i] - min;
            diff = Math.max(profit, diff);
            min = Math.min(min, prices[i]);
        }
        return diff;
    }
}
