public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        helper(num, result, results);
        return results;
    }
    
    public void helper(int[] num, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
        if (result.size() == num.length){
            ArrayList<Integer> temp = new ArrayList<Integer>(result);
            results.add(temp);
            return;
        }
        
        for (int i : num){
            if (!result.contains(i)){
                result.add(i);
                helper(num, result, results);
                result.remove(result.size()-1);
            }
        }
    }
}