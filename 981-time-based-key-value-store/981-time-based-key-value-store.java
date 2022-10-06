class TimeMap {
    HashMap<String, TreeMap<Integer, String>> ValuesMap;
    public TimeMap() {
        ValuesMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> temp = ValuesMap.getOrDefault(key, new TreeMap<>());
        temp.put(timestamp, value);
        ValuesMap.put(key, temp);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tree = ValuesMap.get(key);
        if (tree == null){
            return "";
        }
        Integer floor = tree.floorKey(timestamp);
        if ( floor== null){
            return "";
        }
        return tree.get(floor);
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */