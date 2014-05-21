class Solution {
public:
    int searchInsert(int A[], int n, int target) {
        int tracker = 0;
        
        while (tracker < n){
            if (target > A[tracker]){
                tracker++;
            }
            else if (target <= A[tracker]){
                return tracker;
            }
        }
        return n;
    }
};