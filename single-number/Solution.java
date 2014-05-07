public class Solution {
    public int singleNumber(int[] A) {
        int num = 0;
        for (int i : A){
            num^=i;
        }
        return num;
    }
}