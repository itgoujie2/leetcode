public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.replaceAll("[^0-9a-zA-Z]", "");
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        while(start<=end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}