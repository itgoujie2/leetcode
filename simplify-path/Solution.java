public class Solution {
    public String simplifyPath(String path) {
        
        
        Stack<String> dirs = new Stack<String>();
        String result = "";
        
        path = path + "/";
        
        int i = 0;
        while (i < path.length()){
            i++;
            
            int j = path.indexOf("/", i);
            String dir = "";
            
            if (j>=0){
                dir = path.substring(i, j);
                i = j;    
            }
            else{
                break;
            }
            
            
            if (!dir.isEmpty() && !dir.equals(".")){
                if (dir.equals("..")){
                    if (!dirs.isEmpty()){
                        dirs.pop();
                    }
                }
                else{
                    dirs.push(dir);
                }
            }
        }
        
        ArrayList<String> temp = new ArrayList(dirs);
        for (String s : temp){
            result = result + "/" + s;
        }
        if (result.isEmpty()) result += "/";
        
        return result;
    }
}