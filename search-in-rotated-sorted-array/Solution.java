public class Solution {
    public int search(int[] A, int target) {
        int first = 0;
        int last = A.length -1;
        
        
        while (first <= last){
            int middle = first + (last - first)/2;
            if (A[middle] == target) return middle;
            //first half is sorted
            if (A[first] <= A[middle]){
                if (A[first] <= target && target < A[middle]){
                    last = middle - 1;
                }else{
                    first = middle + 1;
                }
            }else{
                if (A[middle] < target && target <= A[last]){
                    first = middle + 1;
                }else{
                    last = middle - 1;
                }
            }
        }
        return -1;
    }
}