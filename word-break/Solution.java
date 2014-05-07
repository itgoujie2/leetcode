public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true;
        
        for (int i=0; i<s.length(); i++){
            
            if (!t[i]) continue;
            
            for (String word : dict){
                int start = i;
                int end = start + word.length();
                
                if (end>s.length()) continue;
                
                if (t[end]) continue;
                
                if (s.substring(start, end).equals(word)) t[end] = true;
            }
        }
        
        return t[s.length()];
    }
}