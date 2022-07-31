class Solution {
    public int maximumGroups(int[] grades) {
        int group = 1;
        int sum = 0;
        while(sum <= grades.length){
            sum += group;
            group++;
        }
        group-=2;
        return group;
    }
}