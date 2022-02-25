class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> version_1 = new ArrayList<>();
        List<Integer> version_2 = new ArrayList<>();
        String s = "";
        for(int i=0; i<version1.length(); i++){
            if(version1.charAt(i) == '.'){
                version_1.add(Integer.parseInt(s));
                s = "";
            }
            else s += version1.charAt(i);
        }
        version_1.add(Integer.parseInt(s));
        s = "";
        for(int i=0; i<version2.length(); i++){
            if(version2.charAt(i) == '.'){
                version_2.add(Integer.parseInt(s));
                s = "";
            }
            else s += version2.charAt(i);
        }
        version_2.add(Integer.parseInt(s));
        if(version_1.size() != version_2.size()){
            if(version_1.size() > version_2.size()){
                while(version_2.size() != version_1.size()){
                    version_2.add(0);
                }
            }
            else{
                while(version_1.size() != version_2.size()){
                    version_1.add(0);
                }
            }
        }
        for(int i=0; i<version_1.size(); i++){
            if(version_1.get(i) > version_2.get(i)){
                return 1;
            }
            else if(version_1.get(i) < version_2.get(i)){
                return -1;
            }
        }
        return 0;
    }
}