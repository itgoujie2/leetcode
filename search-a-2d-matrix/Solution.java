public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int start = 0;
        int end = row * col - 1;
        
        while (start <= end){
            int mid = start + (end - start)/2;
            int val = matrix[mid/col][mid%col];
            if (target == val) return true;
            else if (target < val){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
    
}