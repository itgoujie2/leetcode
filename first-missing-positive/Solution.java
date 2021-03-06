public class Solution {
    public int firstMissingPositive(int[] A) {
        if (A == null || A.length == 0) return 1;
        
        int i = 0;
        while (i < A.length){
            if (A[i] >= 0 && A[i] < A.length && A[i] != i && A[i] != A[A[i]]){
                int temp = A[A[i]];
                A[A[i]] = A[i];
                A[i] = temp;
            }
            else{
                i++;
            }
        }
        
        for (int j=1; j<A.length; j++){
            if (A[j] != j) return j;
        }
        
        if (A[0] == A.length) return A.length+1;
        else return A.length;
    }
}