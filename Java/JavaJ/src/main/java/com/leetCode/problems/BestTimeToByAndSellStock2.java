package com.leetCode.problems;

public class BestTimeToByAndSellStock2 {
    /*
    * Add up all the diffs where the left is greater than the right
    * Aka buy low sell high
    * Time: O(n)
    * Space:(1) since we aren't really creating anything
    * */
    public int maxProfit(int[] prices) {
        int maxP = 0;
        for(int day = 0; day < prices.length; day++){
            int nextDay = day+1;
            if(nextDay < prices.length && prices[day] < prices[nextDay]){
                maxP = maxP + prices[nextDay] - prices[day];
            }
        }
        return maxP;
    }
}
