class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        s = s.toLowerCase();
        int n = s.length();
        int i = n/2 - 1, j = n/2, count = 0;
        while(i >= 0 && j < n){
            if(set.contains(s.charAt(i))) count++;
            if(set.contains(s.charAt(j))) count--;
            i--;
            j++;
        }
        return count == 0;
    }
}