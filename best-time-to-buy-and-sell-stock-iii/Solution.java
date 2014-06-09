public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int n = prices.length;
        int[] f1 = new int[n];
        int[] f2 = new int[n];
        
        for (int i = 1, low = prices[0]; i < n; i++){
            low = Math.min(low, prices[i]);
            f1[i] = Math.max(f1[i-1], prices[i] - low);
        }
        
        for (int i = n - 2, high = prices[n-1]; i >= 0; i--){
            high = Math.max(high, prices[i]);
            f2[i] = Math.max(f2[i+1], high - prices[i]);
        }
        
        int max = 0;
        for (int i=0; i < n; i++){
            max = Math.max(max, f1[i] + f2[i]);
        }
        
        return max;
    }
}