public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = m > 0 ? obstacleGrid[0].length : 0;
        if (m == 0 || n == 0) return 0;
        
        int[][] map = new int[m+1][n+1];
        map[0][1] = 1;
        
        for (int i=1; i<=m; i++)
        for (int j=1; j<=n; j++){
            if (obstacleGrid[i-1][j-1] == 0){
                map[i][j] = map[i-1][j] + map[i][j-1];
            }
        }
        
        return map[m][n];
    }
    
}