public class Solution {
    public int lengthOfLastWord(String s) {
        //if (s.length() == 0) return 0;
        int len = 0;
        
        int t = s.length() - 1;
        while (t >= 0 && s.charAt(t) == ' ' ){
            t--;
        }
        while (t >=0 && s.charAt(t) != ' '){
            len++;
            t--;
        }
        
        return len;
    }
}