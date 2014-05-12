public class Solution {
    public int maxSubArray(int[] A) {
        int[] tracker = new int[A.length];
        tracker[0] = A[0];
        int max = tracker[0];
        
        for (int i =1; i<A.length; i++){
            if (tracker[i-1]+A[i] > A[i]) tracker[i] = tracker[i-1] + A[i];
            else tracker[i] = A[i];
            max = Math.max(tracker[i], max);
        }
        
        return max;
    }
}