package com.example.datastructure;

public class MaximumProfit {

    public static int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE;
      int maxProfit = 0;

      for (int price : prices) {
        // Update the minimum price
        if (price < minPrice) {
          minPrice = price;
        }
        // Calculate the current profit
        else if (price - minPrice > maxProfit) {
          maxProfit = price - minPrice;
        }
      }

      return maxProfit;
    }

    public static void main(String[] args) {
      int[] prices = {7, 1, 5, 3, 6, 4};
      int maxProfit = maxProfit(prices);
      System.out.println("Maximum Profit: " + maxProfit);
    }

}
