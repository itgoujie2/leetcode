public class Solution {
    public int romanToInt(String s) {
        if (s.length() <= 0) return 0;
        HashMap<Character, Integer> valMap = new HashMap<Character, Integer>();
        valMap.put('I', 1);
        valMap.put('V', 5);
        valMap.put('X', 10);
        valMap.put('L', 50);
        valMap.put('C', 100);
        valMap.put('D', 500);
        valMap.put('M', 1000);
        
        int result = valMap.get(s.charAt(0));
        for (int i=1; i<s.length(); i++){
            if (valMap.get(s.charAt(i)) > valMap.get(s.charAt(i-1))){
                result += valMap.get(s.charAt(i)) - 2*valMap.get(s.charAt(i-1));
            }
            else{
                result += valMap.get(s.charAt(i));
            }
        }
        
        return result;
    }
}