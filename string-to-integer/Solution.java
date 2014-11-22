public class Solution {
    public int atoi(String str) {
        if (str == null || str.length() ==0) return 0;
        
        str = str.trim();
        
        int sign = 1;
        int i = 0;
        if (str.charAt(i) == '+') i++;
        else if (str.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        
        double result = 0;
        while (i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            
            if (result > Integer.MAX_VALUE/10 || result == Integer.MAX_VALUE/10 && str.charAt(i) >= '8') return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            
            result = result*10 + str.charAt(i) - '0';
            i++;
        }
        
        result *= sign;
        
        return (int)result;
    }
}