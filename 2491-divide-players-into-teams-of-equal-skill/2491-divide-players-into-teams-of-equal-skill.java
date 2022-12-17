class Solution {
    public long dividePlayers(int[] skill) {
        long total_sum = 0, chemistry = 0, teams = 0;
        long total_teams = (long)skill.length/2;
        int[] freq = new int[100000];
        int[] visited = new int[skill.length];
        
        for(int x : skill){
            total_sum += (long)x;
            freq[x]++;
        }
        
        long sumOfTeam = total_sum/total_teams;
        for(int i = 0; i < skill.length; i++){
            
            int p1 = skill[i];
            int p2 = (int)sumOfTeam - p1;
            if(p2 < 0) continue;
            if(freq[p2] <= 0 || freq[p1] <= 0) continue;

            
            if(freq[p2] > 0){
                freq[p2]--;
                if(freq[p1] > 0){
                    freq[p1]--;
                    // System.out.println(p1 + " " + p2);
                    teams++;
                    chemistry += (long)(p1*p2);
                }
            }            
        }
        return teams == total_teams ? chemistry : -1;
    }
}