public class Solution {
    public int removeDuplicates(int[] A) {
        if (A == null || A.length == 0) return 0;
        if (A.length == 1) return 1;
        
        int current = A[0];
        int slow = 1;
        int fast = 1;
        while (fast < A.length){
            if (A[fast] != current){
                A[slow] = A[fast];
                current = A[fast];
                slow++;
                fast++;
            }
            else{
                fast++;
            }
        }
        
        return slow;
    }
}