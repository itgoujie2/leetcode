public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        if (num.length < 3) return new ArrayList<List<Integer>>();
        
        Set<List<Integer>> mySet = new HashSet<List<Integer>>();
        
        Arrays.sort(num);
        
        for (int i=0; i<num.length-2; i++){
            int left = i + 1;
            int right = num.length - 1;
            
            while (left < right){
                if (num[i] + num[left] + num[right] < 0){
                    left++;
                }
                else if (num[i] + num[left] + num[right] > 0){
                    right--;
                }
                else{
                    List<Integer> tempList = new ArrayList<Integer>();
                    tempList.add(num[i]);
                    tempList.add(num[left]);
                    tempList.add(num[right]);
                    mySet.add(tempList);
                    left++;
                    right--;
                }    
            }
            
            
        }
        
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        myList.addAll(mySet);
        return myList;
    }
}