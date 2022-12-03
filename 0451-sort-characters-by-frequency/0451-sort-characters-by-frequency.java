class Solution {
    public String frequencySort(String s) {
        if (s == null || s.isEmpty())
            return s;
        int n = s.length();

        int freq[] = new int[256];

        for (char c : s.toCharArray())
            freq[(int) c]++;

        char output[] = new char[n];
        int x = 0;

        int max;
        int index;
        while (x < n) {
            max = 0;
            index = -1;
            for (int i = 0; i < freq.length; i++) {
                if (max < freq[i]) {
                    max = freq[i];
                    index = i;
                }
            }
            //all elements are over
            if (max == 0) {
                return new String(output);
            }
            int temp = max;
            while (temp-- > 0)
                output[x++] = (char) index;

            freq[index] = 0; //nullify this character as it used.
        }


        return new String(output);
        
    }
}