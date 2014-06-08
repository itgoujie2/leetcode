public class Solution {
    public boolean isValid(String s) {
        //if (s.length() == 0) return true;
        //if (s.length() % 2 != 0) return false;
        
        String left = "({[";
        String right = ")}]";
        Stack<Character> helper = new Stack<Character>();
        
        for (int i=0; i<s.length(); i++){
            if (left.contains(s.substring(i, i+1))){
                helper.push(s.charAt(i));
            }
            else{
                if (helper == null || helper.empty()) return false;
                char c = helper.pop();
                int index = right.indexOf(s.charAt(i));
                char cors = left.charAt(index);
                if (cors != c) return false;
            }
        }
        return helper.empty();
    }
    
}