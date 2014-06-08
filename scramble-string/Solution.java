public class Solution {
    public boolean isScramble(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;
        
        int val1 = 0;
        int val2 = 0;
        
        for (int k=0; k<s1.length(); k++){
            val1 += s1.charAt(k) - '0';
            val2 += s2.charAt(k) - '0';
        }
        
        if (val1 != val2) return false;
        
        for (int i=1; i<s1.length(); i++){
            String l1 = s1.substring(0, i);
            String l2 = s1.substring(i);
            
            String r1 = s2.substring(0, i);
            String r2 = s2.substring(i);
            if (isScramble(l1, r1) && isScramble(l2, r2)) return true;
            
            r1 = s2.substring(s2.length()-i);
            r2 = s2.substring(0, s2.length()-i);
            if (isScramble(l1, r1) && isScramble(l2, r2)) return true;
        }
        
        return false;
    }
}