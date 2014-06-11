public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        
        Arrays.sort(num);
        
        for (int i=0; i<num.length-1; i++){
            int s1 = i;
            int s2 = i+1;
            int s3 = num.length-1;
            
            while (s2 < s3){
                int sum = num[s1] + num[s2] + num[s3];
                int diff = Math.abs(sum - target);
                if (diff < min){
                    min = diff;
                    result = sum;
                }
                if (sum < target){
                    s2++;
                }
                else{
                    s3--;
                }
            }
        }
        
        return result;
    }
}