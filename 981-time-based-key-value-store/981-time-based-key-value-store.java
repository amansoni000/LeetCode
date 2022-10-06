class TimeMap {
    HashMap<String, HashMap<Integer, String>> ValuesMap;
    HashMap<String, List<Integer>> timeMap;
    public TimeMap() {
        ValuesMap = new HashMap<>();
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<Integer, String> tempMap = ValuesMap.getOrDefault(key, new HashMap<>());
        tempMap.put(timestamp, value);
        ValuesMap.put(key, tempMap);
        
        List<Integer> time_list = timeMap.getOrDefault(key, new ArrayList<>());
        time_list.add(timestamp);
        timeMap.put(key, time_list);
    }
    
    public String get(String key, int timestamp) {
        if(ValuesMap.containsKey(key)){
            if(ValuesMap.get(key).containsKey(timestamp)) return ValuesMap.get(key).get(timestamp);
            List<Integer> list = timeMap.get(key);
            if(timestamp < list.get(0)) return "";
            int l = 0, r = list.size()-1, ans = 0;
            while(l <= r){
                int mid = (l+r)/2;
                if(list.get(mid) < timestamp){
                    ans = mid;
                    l = mid+1;
                }
                else if(list.get(mid) > timestamp) r = mid - 1;
                }
                // System.out.println(map.get(key));
            return ValuesMap.get(key).get(list.get(ans));
        }
        else return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */