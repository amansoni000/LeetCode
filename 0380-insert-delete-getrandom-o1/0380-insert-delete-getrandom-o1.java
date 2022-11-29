class RandomizedSet {
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public void swap(int idx){
        int temp = list.get(idx);
        list.set(idx, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        else{
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int idx = map.get(val);
            swap(idx);
            map.put(list.get(idx), idx);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        else return false;
    }
    
    public int getRandom() {
        int size = list.size();
        int n = (int)(Math.random()*(double)size);
        return list.get(n);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */