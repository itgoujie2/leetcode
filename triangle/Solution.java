public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int height = triangle.size();
        
        for (int i=height-2; i>=0; i--){
            for (int j=0; j<i+1; j++){
                ArrayList<Integer> current = triangle.get(i);
                ArrayList<Integer> next = triangle.get(i+1);
                current.set(j, current.get(j) + Math.min(next.get(j), next.get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}