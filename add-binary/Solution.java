public class Solution {
    public String addBinary(String a, String b) {
        a = doReverse(a);
        b = doReverse(b);
        
        int n = a.length() > b.length() ? a.length() : b.length();
        
        int carry = 0;
        String result = "";
        for (int i=0; i<n; i++){
            int ai = i < a.length() ? a.charAt(i) - '0' : 0;
            int bi = i < b.length() ? b.charAt(i) - '0' : 0;
            result += Integer.toString((ai + bi + carry) % 2);
            carry = (ai + bi + carry) / 2;
        }
        if (carry == 1) result += "1";
        return doReverse(result);
    }
    
    public String doReverse(String s){
        char[] tArray = s.toCharArray();
        for (int i=0; i<tArray.length/2; i++){
            char temp = tArray[i];
            tArray[i] = tArray[tArray.length-1-i];
            tArray[tArray.length-1-i] = temp;
        }
        return new String(tArray);
    }
}