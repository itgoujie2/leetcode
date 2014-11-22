public class Solution {
    public String addBinary(String a, String b) {
        String temp;
        
        if (b.length() > a.length()){
            temp = a;
            a = b;
            b = temp;
        }
        
        StringBuilder result = new StringBuilder(a.length() + 1);
        
        int adding = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int digit = 0;
        while (i >= 0){
            if (j >= 0){
                digit = (a.charAt(i) - '0') + (b.charAt(j) - '0') + adding;    
            }
            else digit = (a.charAt(i) - '0') + adding;
            adding = digit / 2;
            result.append(digit % 2);
            i--;
            j--;
        }
        if (adding >= 1) result.append(adding);
        
        return result.reverse().toString();
    }
}