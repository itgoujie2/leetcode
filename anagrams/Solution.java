public class Solution {
    public List<String> anagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<String, List<String>>();
        List whatever = new ArrayList();
        
        for (int i=0; i<strs.length; i++){
            String temp = sortString(strs[i]);
            if (result.get(temp) == null){
                List jj = new ArrayList();
                jj.add(strs[i]);
                result.put(temp, jj);
            }
            else{
                result.get(temp).add(strs[i]);
            }
        }
        
        for (String s : result.keySet()){
            if (result.get(s).size() > 1) whatever.addAll(result.get(s));
        }
        
        return whatever;
    }
    
    private String sortString(String inString){
        char[] charArray = inString.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}