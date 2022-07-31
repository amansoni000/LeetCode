class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int n = grades.length, max = 0, sum = 0, count = 0, prev = 0, group = 0;;
        for(int i = 0; i < n ; i++){
            sum += grades[i];
            count++;
            if(sum > max && count > prev){
                max = sum;
                sum = 0;
                prev = count;
                count = 0;
                group++;
            }
        }
        return group;
    }
}