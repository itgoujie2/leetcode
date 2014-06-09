public class Solution {
    public String countAndSay(int n) {
        String current = "1";
        if (n == 1) return current;
        int i = 2;
        while (i <= n){
            current = helper(current);
            i++;
        }
        return current;
    }
    
    public String helper(String input){
        char prev = input.charAt(0);
        
        int i = 1;
        String result = "";
        int count = 1;
        while (i < input.length()){
            if (input.charAt(i) == prev){
                count++;
            }
            else{
                result += count;
                result += prev;
                prev = input.charAt(i);
                count = 1;
            }
            i++;
        }
        
        result += count;
        result += prev;
        
        return result;
    }
}