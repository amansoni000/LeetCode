class Solution:
    def romanToInt(self, S: str) -> int:
        count=0
        roman = { "I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000 , "&":-1}
        S = S+"&"
        for i in range(0,len(S)-1):
            if roman[S[i]]<roman[S[i+1]] :
                count-=roman[S[i]]
            else:
                count+=roman[S[i]]
        return count