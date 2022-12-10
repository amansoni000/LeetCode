class Solution {
    int res = Integer.MIN_VALUE;
    class Graph
    {
        private int V;   // No. of vertices
        private LinkedList<Integer> adj[]; 
        Graph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v,int w)
        {
            adj[v].add(w);
            adj[w].add(v);
        }
        
        void trav(int[] val, int k)
        {
            int V = val.length;
            ArrayList<Boolean> vis = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                vis.add(false);
            }
            ArrayList<Integer> bfs_traversal = new ArrayList<>();
            
            for (int i = 0; i < V; ++i) {
                LinkedList<Integer> arr = adj[i];
                
                
                arr.sort((a, b) -> val[b]-val[a]);   
                
                int sum = val[i], max = val[i];
                for(int j =  0; j < k && j < arr.size(); j++){
                    
                   sum += val[arr.get(j)];
                   max = Math.max(max, sum);
                    
                }
                res = Math.max(max, res);       
                
            }
        }
        
    }
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        Graph g = new Graph(n);

        for(int[] arr : edges){
            g.addEdge(arr[0], arr[1]);
        }
        g.trav(vals, k);
        return res;
    }
}