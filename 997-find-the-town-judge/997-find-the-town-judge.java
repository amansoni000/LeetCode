class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length==0){
            return 1;
        }
        HashMap<Integer,Integer> hs = new HashMap<>(); 
        HashMap<Integer,Integer> hs1 = new HashMap<>(); 
        int len = trust.length;
        int judge = 0;
        for(int i=0;i<len;i++)
        {
            hs.put(trust[i][1],hs.getOrDefault(trust[i][1],0)+1);
            hs1.put(trust[i][0],hs1.getOrDefault(trust[i][0],0)+1);
        }
        for(int i=1;i<n+1;i++){
            if(hs.containsKey(i)){
                if(hs.get(i)==n-1){
                    judge=i;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            if(hs1.containsKey(judge))
            {
                return -1;
            }
        }
        if(judge==0){
            return -1;
        }
        return judge;
    }
}