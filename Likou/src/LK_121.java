public class LK_121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit1(int[] prices) {
        int x2 = prices.length - 2;
        int x1 = 1;
        int maxPrice = Math.max(0, (prices[prices.length - 1] - prices[0]));
        while (x1 < x2) {
            if (prices[x1] < prices[x1 - 1]) {
                maxPrice = Math.max(maxPrice, (prices[x2] - prices[x1]));
            }
            x1++;
            if (prices[x2] > prices[x2 + 1]) {
                maxPrice = Math.max(maxPrice, (prices[x2] - prices[x1]));
            }
            x2--;

        }
        return maxPrice;
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length - 1;
        int maxPrice = Math.max(0, (prices[len] - prices[0]));
        for (int i = 0; i < len; ++i) {
            if (prices[i] < prices[i + 1]) {
                for (int j = i + 1; j <= len; ++j) {
                    if (prices[j] > prices[j - 1]) {
                        maxPrice = Math.max(maxPrice, (prices[j] - prices[i]));
                    }
                }
                i++;
            }
        }
        return maxPrice;
    }
    public int maxProfit2(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }
}
