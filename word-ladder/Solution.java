public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        if (dict == null || dict.size() == 0) return 0;
        LinkedList<String> wordQueue = new LinkedList<String>();
        LinkedList<Integer> distQueue = new LinkedList<Integer>();
        
        wordQueue.add(start);
        distQueue.add(1);
        
        while (!wordQueue.isEmpty()){
            String currWord = wordQueue.pop();
            int currDist = distQueue.pop();
            
            if (currWord.equals(end)){
                return currDist;
            }
            
            
            for (int i=0; i<currWord.length(); i++){
                char[] charArray = currWord.toCharArray();
                for (char j='a'; j<='z'; j++){
                    charArray[i] = j;
                    String newWord = new String(charArray);
                    if (dict.contains(newWord)){
                        wordQueue.add(newWord);
                        distQueue.add(currDist+1);
                        dict.remove(newWord);
                    }
                }
            }
        }
        
        return 0;
    }
}