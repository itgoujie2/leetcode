public class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0 || s == null) return 0;
        
        int count = 0;
        int current = s.length()-1;
        while (current >= 0){
            if (s.charAt(current) == ' ' && count == 0){
                current--;
            }
            else if (s.charAt(current) == ' ' && count != 0){
                return count;
            }
            else{
                count++;
                current--;
            }
        }
        return count;
    }
}