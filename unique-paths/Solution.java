public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m+2][n+2];
        for (int i=0; i<m+2; i++)
            for (int j=0; j<n+2; j++)
                map[i][j] = -1;
        return helper(1, 1, m, n, map);
    }
    
    public int helper(int x, int y, int m, int n, int[][] map){
        if (x > m || y > n) return 0;
        if (x == m && y == n) return 1;
        
        if (map[x+1][y] == -1) map[x+1][y] = helper(x+1, y, m, n, map);
        if (map[x][y+1] == -1) map[x][y+1] = helper(x, y+1, m, n, map);
        
        return map[x+1][y] + map[x][y+1];
    }
    
}