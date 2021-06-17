package arrays.stock_buy_sell;

/*
Maximum profit by buying and selling a share at most twice
In daily share trading, a buyer buys shares in the morning and sells them on the same day.
If the trader is allowed to make at most 2 transactions in a day, whereas the second transaction can only start
after the first one is complete (Sell->buy->sell->buy).
Given stock prices throughout the day, find out the maximum profit that a share trader could have made.

Examples:

Input:   price[] = {10, 22, 5, 75, 65, 80}
Output:  87
Trader earns 87 as sum of 12, 75
Buy at 10, sell at 22,
Buy at 5 and sell at 80

Input:   price[] = {2, 30, 15, 10, 8, 25, 80}
Output:  100
Trader earns 100 as sum of 28 and 72
Buy at price 2, sell at 30, buy at 8 and sell at 80

 */

public class StockBuySellMaxProfitTest {
    public static void main(String[] args) {
        int[] price = { 2, 30, 35, 10, 8, 25, 80, 6 };
        int profit = 0;

        for (int i = 1; i < price.length; i++) {
            int sub = price[i] - price[i - 1];
            if (sub > 0)
                profit += sub;
        }
        System.out.print("Maximum Profit: " + profit);
    }
}
