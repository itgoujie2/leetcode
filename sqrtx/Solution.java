public class Solution {
    public int sqrt(int x) {
        if (x < 2) return x;
        int left = 1;
        int right = x / 2;
        int lastMid = -1;
        
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (x / mid > mid){
                left = mid + 1;
                lastMid = mid;
            }
            else if (x / mid < mid){
                right = mid - 1;
            }
            else{
                return mid;
            }
        }
        
        return lastMid;
    }
}