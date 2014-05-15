public class Solution {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        int total = m + n;
        if (total % 2 == 1){
            return helper(A, m, B, n, total/2 + 1);
        }       
        else{
            return (helper(A, m, B, n, total/2) + helper(A, m, B, n, total/2 + 1)) / 2.0;
        }
    }
    
    public int helper(int A[], int m, int B[], int n, int k){
        if (m > n) return helper(B, n, A, m, k);
        if (m == 0) return B[k-1];
        if (k == 1) return Math.min(A[0], B[0]);
        
        int amid = Math.min(k/2, m);
        int bmid = k - amid;
        if (A[amid-1] < B[bmid-1]){
            return helper(Arrays.copyOfRange(A, amid, A.length), m - amid, B, n, k - amid);
        }
        else if (A[amid-1] > B[bmid-1]){
            return helper(A, m, Arrays.copyOfRange(B, bmid, B.length), n - bmid, k - bmid);
        }
        else return A[amid-1];
    }
}