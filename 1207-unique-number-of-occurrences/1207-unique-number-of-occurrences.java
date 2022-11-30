class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i < arr.length; i++){
            count = 1;
            while(i < arr.length - 1 && arr[i] == arr[i+1]){
                count += 1;
                i++;
            }
            // System.out.println(count + " "  + arr[i]);
            if(set.contains(count)) return false;
            else set.add(count);
        }
        return true;
    }
}