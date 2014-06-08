// public class Solution {
//     public ArrayList<ArrayList<Integer>> combine(int n, int k) {
//         ArrayList<Integer> result = new ArrayList<Integer>();
//         ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
//         helper(n, k, 1, 0, result, results);
//         return results;
//     }
    
//     public void helper(int n, int k, int start, int step, ArrayList<Integer> result, ArrayList<ArrayList<Integer>> results){
//         if (step == k){
//             ArrayList<Integer> temp = new ArrayList<Integer>(result);
//             results.add(temp);
//         }
        
//         for (int i=start; i<=n; i++){
//             result.add(i);
//             helper(n, k, i+1, step+1, result, results);
//             result.remove(result.size()-1);
//         }
//     }
// }

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int d = 1;
        while (x / d >= 10) d *= 10;
        
        while (x > 0){
            int first = x / d;
            int last = x % 10;
            if (first != last) return false;
            x = x % d / 10;
            d = d / 100;
        }
        
        return true;
    }
}