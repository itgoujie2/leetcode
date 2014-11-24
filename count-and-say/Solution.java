public class Solution {
    public String countAndSay(int n) {
        StringBuilder temp = new StringBuilder();
        String tracker = "1";
        
        int i = 2;
        while (i <= n){
            int j = 1;
            char current = tracker.charAt(0);
            int count = 1;
            while (j < tracker.length()){
                if (tracker.charAt(j) == current){
                    count++;
                    j++;
                }
                else{
                    temp.append(count);
                    temp.append(current);
                    count = 1;
                    current = tracker.charAt(j);
                    j++;
                }
            }
            temp.append(count);
            temp.append(current);
            tracker = temp.toString();
            temp = temp.delete(0, temp.length());
            i++;
        }
        
        return tracker;
    }
}