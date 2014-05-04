public class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String result = "";
        int i=0;

        while (i<s.length()){
        	if (s.charAt(i) == ' ' && temp.isEmpty()){
        		i++;
        		continue;
        	}
        	if (s.charAt(i) == ' ' && !temp.isEmpty()){

        		result = temp + " " + result;
        		temp = "";
        		i++;
        		continue;
        	}
        	if (s.charAt(i) != ' '){
        		temp = temp + s.charAt(i);
        		i++;
        		continue;
        	}
        	i++;
        }
        if (!temp.isEmpty()){
        	result = temp + " " + result;
        }else{
        	result = result;
        }
        
        if (result.length()>0) result = result.substring(0, result.length()-1);
        else result = result;
        return result;
    }
}