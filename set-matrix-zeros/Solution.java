public class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        boolean row_has_zero = false;
        boolean col_has_zero = false;
        
        for (int i=0; i<n; i++){
            if (matrix[0][i] == 0) {
                row_has_zero = true;
                break;
            }
        }
        
        for (int j=0; j<m; j++){
            if (matrix[j][0] == 0){
                col_has_zero = true;
                break;
            }
        }
        
        for (int i=1; i<m; i++)
        for (int j=1; j<n; j++){
            if (matrix[i][j] == 0){
                matrix[0][j] = matrix[i][0] = 0;
            }
        }
        
        for (int i=1; i<m; i++)
        for (int j=1; j<n; j++){
            if (matrix[0][j] ==0 || matrix[i][0] == 0) matrix[i][j] = 0;
        }
        
        if (row_has_zero){
            for (int j=0; j<n; j++){
                matrix[0][j] = 0;
            }
        }
        
        if (col_has_zero){
            for (int i=0; i<m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}