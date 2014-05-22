public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        Arrays.sort(num);
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        
        helper(num, 0, result, results);
        return results;
    }
    
    public void helper(int[] S, int step, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
        if (step == S.length){
            ArrayList<Integer> temp = new ArrayList<Integer>(result);
            if (!results.contains(temp)) results.add(temp);
            return;
        }
        
        //not add S[step]
        helper(S, step+1, result, results);
        //add S[step]
        result.add(S[step]);
        helper(S, step+1, result, results);
        result.remove(result.size() - 1);
    }
}