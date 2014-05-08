public class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
            x = -x;
        }
        int rest = 0;
        while(x>0){
            rest = rest*10 + x%10;
            x = x/10;
        }
        if (rest>Integer.MAX_VALUE) return 0;
        if (neg) return -(int)rest;
        return (int)rest;
    }
}