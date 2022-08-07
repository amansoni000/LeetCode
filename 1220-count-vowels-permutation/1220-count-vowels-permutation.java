class Solution {
    public int countVowelPermutation(int n) {
        long[] arr = new long[26];
        int mod=1000000007;
        arr['a' - 'a'] = 1;
        arr['e' - 'a'] = 1;
        arr['i' - 'a'] = 1;
        arr['o' - 'a'] = 1;
        arr['u' - 'a'] = 1;
        while(n > 1){
            long[] arr2 = new long[26];
            arr2['a' - 'a'] += (arr['e' - 'a'] + arr['i' - 'a'] + arr['u' - 'a'])%mod;
            arr2['e' - 'a'] += (arr['a' - 'a'] + + arr['i' - 'a'])%mod;
            arr2['i' - 'a'] += (arr['e' - 'a'] + arr['o' - 'a'])%mod;
            arr2['o' - 'a'] += (arr['i' - 'a']%mod);
            arr2['u' - 'a'] += (arr['i' - 'a'] + arr['o' - 'a'])%mod;
            arr = arr2;
            n--;
        }
        long ans = 0;
        for(long i : arr){
            System.out.print(i + " ");
            ans += i;
            ans%=mod;
        }
        return (int)ans;
    }
}