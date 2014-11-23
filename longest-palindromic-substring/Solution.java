public class Solution {
    public String longestPalindrome(String s) {
        final int n = s.length();
        boolean[][] f = new boolean[n][n];
        
        int start = 0;
        int len = 1;
        
        for (int i=0; i<n; i++){
            f[i][i] = true;
            for (int j=0; j<i; j++){
                f[j][i] = s.charAt(j) == s.charAt(i) && (i-j<2 || f[j+1][i-1]);
                
                if (i-j+1 > len && f[j][i]){
                    len = i-j+1;
                    start = j;
                }
            }
        }
        
        return s.substring(start, start+len);
    }
}