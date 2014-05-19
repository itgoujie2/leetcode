public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, result, results);
        return results;
    }
    
    public void helper(int[] candidates, int gap, int start, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
        if (gap == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(result);
            results.add(temp);
            return;
        }
        for (int i=start; i<candidates.length; i++){
            if (gap < candidates[i]) return;
            
            result.add(candidates[i]);
            helper(candidates, gap-candidates[i], i, result, results);
            result.remove(result.size()-1);
        }
    }
}