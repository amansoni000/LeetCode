class Solution:
    def romanToInt(self, s: str) -> int:
        
        sum = 0
        '''
        for i in range(len(s)):
            if s[i] == 'I':
                s[i]=1
            elif s[i]=='V':
                s[i]=5
            elif s[i] == 'X':
                s[i]=10
            elif s[i]=='L':
                s[i]=50
            elif s[i]=='C':
                s[i]=100
            elif s[i]=='D':
                s[i]=500
            elif s[i]=='M':
                s[i]=1000
        print(s)
        '''
        
        
        IV = s.count("IV") * 4
        s = s.replace("IV","")
        
        IX = s.count("IX") * 9
        s = s.replace("IX","")
        
        XL = s.count("XL") * 40
        s = s.replace("XL","")
        
        XC = s.count("XC") * 90
        s = s.replace("XC","")
        
        CD = s.count("CD") * 400
        s = s.replace("CD","")
        
        CM = s.count("CM") * 900
        s = s.replace("CM","")
        
        
        I = s.count("I")
        s = s.replace("I","")
        
        V = s.count("V") * 5
        s = s.replace("V","")
        
        X = s.count("X") * 10
        s = s.replace("X","")
        
        L = s.count("L") * 50
        s = s.replace("L","")
        
        C = s.count("C") * 100
        s = s.replace("C","")
        
        D = s.count("D") * 500
        s = s.replace("D","")
        
        M = s.count("M") * 1000
        s = s.replace("M","")
        
        return IV + IX + XL + XC + CD + CM + I + V + X + L + C + D + M
        