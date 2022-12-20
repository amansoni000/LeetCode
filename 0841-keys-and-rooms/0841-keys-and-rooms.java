class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        
        HashSet<Integer> set = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();

        que.add(0);
        
        while(!que.isEmpty()){
            int size = que.size();
            for(int  i = 0; i < size; i++){
                int room = que.remove();
                set.add(room);
                List<Integer> newKeys = rooms.get(room);
                for(int key : newKeys){
                    if(!set.contains(key)){
                        que.add(key);
                    }
                }
            }
        }
        return set.size() == n;
    }
}