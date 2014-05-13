public class Solution {
    public int minCut(String s) {
        int[] result = new int[s.length()];
        boolean[][] pp = new boolean[s.length()][s.length()];
        
        for (int i=s.length()-1; i>=0; i--)
            for (int j=i; j<s.length(); j++){
                if (s.charAt(i) == s.charAt(j) && (j-i<=1 || pp[i+1][j-1])){
                    pp[i][j] = true;
                }
            }
        
        for (int i=0; i<s.length(); i++){
            int max = s.length();
            if (pp[0][i]){
                result[i] = 0;
            }else{
                for (int j=0; j<i; j++){
                    if (pp[j+1][i] && result[j] + 1 < max){
                        max = result[j] + 1;
                    }
                }
                result[i] = max;
            }
        }
        return result[s.length()-1];
    }
}