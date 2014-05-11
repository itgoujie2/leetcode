public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> storage = new HashMap<Integer, Integer>();
        int tracker = 0;
        
        while (tracker < numbers.length){
            int temp = target - numbers[tracker];
            if (storage.get(temp) != null){
                return new int[]{storage.get(temp)+1, tracker+1};
            }
            else{
                storage.put(numbers[tracker], tracker);
            }
            tracker++;
        }
        return null;
    }
}