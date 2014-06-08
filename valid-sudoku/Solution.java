public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        
        //row
        for (int i=0; i<n; i++){
            HashSet<Character> temp = new HashSet<Character>();
            for (int j=0; j<n; j++){
                if (board[i][j] != '.' && !temp.add(board[i][j])) return false;
            }
        }
        
        //column
        for (int i=0; i<n; i++){
            HashSet<Character> temp = new HashSet<Character>();
            for (int j=0; j<n; j++){
                if (board[j][i] != '.' && !temp.add(board[j][i])) return false;
            }
        }
        
        //9-cube
        for (int i=0; i<3; i++)
        for (int j=0; j<3; j++){
            HashSet<Character> temp = new HashSet<Character>();
            for (int p=i*3; p<i*3+3; p++)
            for (int q=j*3; q<j*3+3; q++){
                if (board[p][q] != '.' && !temp.add(board[p][q])) return false;
            }
        }
        
        return true;
    }
}