class MyHashSet {
    List<Integer> list = new ArrayList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        list.add(key);
    }
    
    public void remove(int key) {
        List<Integer> val = new ArrayList<>();
        val.add(key);
        list.removeAll(val);
    }
    
    public boolean contains(int key) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */