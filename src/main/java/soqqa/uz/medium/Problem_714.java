package soqqa.uz.medium;

public class Problem_714 {
    /*
      Paths :
      https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee
      */
    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
    }

    public static int maxProfit(int[] prices, int fee) {
        int len = prices.length, buying = 0, selling = -prices[0];
        for (int i = 1; i < len; i++) {
            buying = Math.max(buying, selling + prices[i] - fee);
            selling = Math.max(selling, buying - prices[i]);
        }
        return buying;
    }
}
