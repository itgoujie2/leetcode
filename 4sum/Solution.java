public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        if (num.length < 4) return new ArrayList<List<Integer>>();
        
        Arrays.sort(num);
        Set<List<Integer>> mySet = new HashSet<List<Integer>>();
        
        for (int i=0; i<num.length-3; i++)
            for (int j=i+1; j<num.length-2; j++){
                int left = j + 1;
                int right = num.length - 1;
                
                while (left < right){
                    if (num[i] + num[j] + num[left] + num[right] < target){
                        left++;
                    }
                    else if (num[i] + num[j] + num[left] + num[right] > target){
                        right--;
                    }
                    else{
                        List<Integer> tempList = new ArrayList<Integer>();
                        tempList.add(num[i]);
                        tempList.add(num[j]);
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