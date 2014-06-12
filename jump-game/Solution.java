public class Solution {
    public boolean canJump(int[] A) {
        if (A.length == 0) return false;
        
        int[] f = new int[A.length];
        f[0] = A[0];
        
        for (int i=1; i<A.length; i++){
            f[i] = Math.max(f[i-1], A[i-1]) - 1;
            if (f[i] < 0) return false;
        }
        
        return f[A.length-1]>=0;
    }
}