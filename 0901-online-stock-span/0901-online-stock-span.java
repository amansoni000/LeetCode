class StockSpanner {
    List<Integer> list;
    int last_of_prev = 0;
    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        if(list.size() == 1) return 1;
        int idx = list.size()-2, ans = 1;
        if(price >= list.get(idx)){
            ans = list.size() - last_of_prev - 1;
            while(last_of_prev >= 0 && list.get(last_of_prev) <= price){
                last_of_prev--;
                ans++;
            }
        }
        else{
            last_of_prev = list.size() - 1;
        }
        // System.out.println(last_of_prev);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */