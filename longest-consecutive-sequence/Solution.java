public class Solution {
    public int longestConsecutive(int[] num) {
        Set<Integer> mySet = new HashSet<Integer>();
        int max = 0;
        
        for (int i : num){
            mySet.add(i);
        }
        
        for (int e : num){
            int left = e - 1;
            int right = e + 1;
            int count = 1;
            
            while (mySet.contains(left)){
                count++;
                mySet.remove(left);
                left--;
            }
            
            while (mySet.contains(right)){
                count++;
                mySet.remove(right);
                right++;
            }
            
            max = Math.max(count, max);
        }
        
        return max;
    }
}