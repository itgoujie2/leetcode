public class Solution {
    public int search(int[] A, int target) {
        int first = 0;
        int last = A.length - 1;
        
        while (first <= last){
            int mid = first + (last - first) / 2;
            
            if (A[mid] == target) return mid;
            
            if (A[first] <= A[mid]){
                if (A[first] <= target && target < A[mid]){
                    last = mid - 1;
                }
                else{
                    first = mid + 1;
                }
            }
            else{
                if (A[mid] < target && target <= A[last]){
                    first = mid + 1;
                }
                else{
                    last = mid - 1;
                }
            }
        }
        
        return -1;
    }
}