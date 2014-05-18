public class Solution {
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
        ArrayList<String> result = new ArrayList<String>();
        int start = 0;
        helper(s, start, result, results);
        return results;
    }
    
    public void helper(String s, int start, ArrayList<String> result, ArrayList<ArrayList<String>> results){
        if (start>=s.length()){
            ArrayList<String> temp = new ArrayList<String>(result);
            results.add(temp);
        }else{
            for (int i = start; i<s.length(); i++){
                if (valid(s, start, i)){
                    result.add(s.substring(start, i+1));
                    helper(s, i+1, result, results);
                    result.remove(result.size()-1);
                }
            }
        }
    }
    
    public boolean valid(String s, int start, int end){
        while (start<=end){
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}