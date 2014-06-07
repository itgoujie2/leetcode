public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        generate(n, "", 0, 0, results);
        return results;
    }
    
    public void generate(int n, String result, int l, int r, List<String> results){
        if (l == n){
            String temp = result;
            for (int i = 1; i<=n-r; i++){
                temp += ")";     
            }
            results.add(temp);
            return;
        }
        
        generate(n, result+"(", l+1, r, results);
        if (l > r) generate(n, result+")", l, r+1, results);
    }
}