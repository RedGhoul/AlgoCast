package com.leetCode.problems;

public class BestTimetoBuyandSellStock1 {
    /*
    * So what your basically trying to do here is compare the
    * difference between the smallest number
    * you found so far, to any number in front of it that is larger
    *
    * */
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        if(prices.length == 1) return 0;
        if(prices.length == 2){
            if(prices[0] < prices[1]){
                return prices[1]-prices[0];
            }else{
                return 0;
            }
        }


        int min = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        for(int i =0; i < prices.length; i++){
            if(prices[i] < min){ // seeing if you could find anything even less than the current min
                min = prices[i];
            }else if(prices[i] - min > maxPrice){// this would be the case where we are past the min and go onto to something greater
                maxPrice = prices[i]-min;
            }
        }
        if(maxPrice < 0) return 0;
        return maxPrice;
    }
}
