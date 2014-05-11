public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<ArrayList<Integer>>();
        int[][] helperArray = new int[numRows+1][numRows+1];
        init(numRows, helperArray);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for (int i=1; i<=numRows; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j=1; j<=numRows; j++){
                if (helperArray[i][j] != 0) temp.add(helperArray[i][j]);
            }
            if (temp.size() > 0) result.add(temp);    
        }
        return result;
    }
    
    public void init(int numRows, int[][] helperArray){
        helperArray[1][1] = 1;
        for (int i=2; i<=numRows; i++)
            for (int j=1; j<=numRows; j++){
                helperArray[i][j] = helperArray[i-1][j-1] + helperArray[i-1][j];
            }
    }
}