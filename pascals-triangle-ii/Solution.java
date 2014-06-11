public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] triangle = new int[rowIndex+2][rowIndex+2];
        triangle[0][1] = 1;
        for (int i=1; i<=rowIndex; i++)
        for (int j=1; j<=i+1; j++){
            triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
        }
        
        List<Integer> result = new ArrayList<Integer>();
        for (int k=1; k<=rowIndex+1; k++){
            result.add(triangle[rowIndex][k]);
        }
        return result;
    }
}