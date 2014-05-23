public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int diff = Integer.MIN_VALUE;
        for (int i=1; i<prices.length; i++){
            diff = prices[i] - prices[i-1];
            if (diff > 0) sum += diff;
        }
        return sum;
    }
}