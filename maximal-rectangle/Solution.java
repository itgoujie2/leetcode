public class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = m==0 ? 0 : matrix[0].length;
        int[][] height = new int[m][n];
        
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++){
                if (matrix[i][j] == '0'){
                    height[i][j] = 0;
                }
                else{
                    height[i][j] = i==0 ? 1 :height[i-1][j] + 1;
                }
            }
        
        int max = 0;
        for (int k=0; k<matrix.length; k++){
            max = Math.max(max, maxInHis(height[k]));
        }
        return max;
    }
    
    private int maxInHis(int[] height){
        Stack<Integer> stack = new Stack<Integer>();
        int maxArea = 0;
        int i=0;
        int[] h = new int[height.length+1];
        h = Arrays.copyOf(height, height.length+1);
        
        while(i < h.length){
            if (stack.empty() || h[stack.peek()]<=h[i]){
                stack.push(i++);
            }
            else{
                int t = stack.pop();
                maxArea = Math.max(maxArea, h[t]*(stack.empty()?i:i-stack.peek()-1));
            }
        }
        
        return maxArea;
    } 
}