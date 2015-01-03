public class Solution {
    public void nextPermutation(int[] num) {
        //step 1
        //from right to left, find the first digit violating the accending trend
        int partition = 0;
        int changing = 0;
        for (partition=num.length-2; partition>=0; partition--){
            if (num[partition] >= num[partition+1]) continue;
            
            //step 2
            //from right to left, find the first digit greater than partition
            for (changing=num.length-1; changing>partition; changing--){
                if (num[changing] > num[partition]){
                    break;
                }
            }    
            break;
            
        }
        
        
        
        //step 3
        //swap partition and changing
        if (partition >= 0){
            int temp = num[changing];
            num[changing] = num[partition];
            num[partition] = temp;        
        }
        
        //step 4
        //reverse the nums after partition
        int start = partition + 1;
        int end = num.length - 1;
        while (start < end){
            int tt = num[start];
            num[start] = num[end];
            num[end] = tt;
            start++;
            end--;
        }
        
    }
}