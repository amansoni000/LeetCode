class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start=0, end = people.length-1;
        int boats=0;
        while(start<=end){
            if(people[start]+people[end]<=limit){
                boats++;
                start++;
                end--;
            }
            else{
                boats++;
                end--;
            }
        }
        return boats;
    }
}