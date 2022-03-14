class Solution {
    public String simplifyPath(String path) {
        List<String> list = new ArrayList<>();
        path += "/";
        String dot = ".", twodot = "..", s = "";
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == '/'){
                if(s.equals(dot));
                else if(s.equals(twodot) && list.size() > 0) list.remove((list.size() - 1)); 
                else if(s.length() > 0 && !s.equals(twodot)) list.add(s);
                s = "";
            }
            else s += path.charAt(i);
        }
        s = "";
        for(String i : list){
            s += "/";
            s += i;
        }
        if(s.length() == 0) s = "/";
        return s;
    }
}