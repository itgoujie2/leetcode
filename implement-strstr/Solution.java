public class Solution {
    public String strStr(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        
        if (needleLen == 0 && haystackLen ==0) return "";
        if (needleLen ==0) return haystack;
        
        for (int i=0; i<haystackLen; i++){
            if (haystackLen-i+1 < needleLen) return null;
            int k=i;
            int j=0;
            while (k<haystackLen && j<needleLen && needle.charAt(j) == haystack.charAt(k)){
                k++;
                j++;
                if (j == needleLen) return haystack.substring(i);
            }
        }
        
        return null;
    }
}