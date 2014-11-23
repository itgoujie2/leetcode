public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) return "";
        
        int s = Integer.MAX_VALUE;
        for (int i=0; i<strs.length; i++){
            if (strs[i].length() == 0) return "";
            if (strs[i].length() < s) s = strs[i].length();
        }
        
        StringBuilder result = new StringBuilder();
        
        int current = 0;
        while (current < s){
            for (int i=1; i<strs.length; i++){
                if (strs[i-1].charAt(current) != strs[i].charAt(current)){
                    return result.toString();
                }
            }
            result.append(strs[0].charAt(current));
            current++;
        }
        
        return result.toString();
        
    }
}