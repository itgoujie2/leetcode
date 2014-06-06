public class Solution {
    public String intToRoman(int num) {
        int[] radix = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        String result = "";
        for (int i=0; num>0; i++){
            int count = num / radix[i];
            num %= radix[i];
            for (; count>0; count--) result += symbol[i];
        }
        
        return result;
    }
}