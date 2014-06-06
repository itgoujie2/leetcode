public class Solution {
    public int climbStairs(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        
        int[] tracker = new int[n+1];
        tracker[0] = 1;
        tracker[1] = 1;
        for (int i=2; i<=n; i++){
            tracker[i] = tracker[i-1] + tracker[i-2];
        }
        
        return tracker[n];
    }
    
}