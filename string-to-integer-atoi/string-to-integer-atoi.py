class Solution:
    def myAtoi(self, s: str) -> int:
        maxval = 2**31 -1
        minval = -2**31
        dic = {'1':'1', '2':'2', '3':'3', '4':'4', '5':'5', '6':'6', '7':'7', '8':'8', '9':'9', '0':'0'}
        s1=""
        sign = 0
        start=0
        for i in s:
            if(i==' ' and start==0):
                continue
            elif((i=='-' or i=='+') and sign==0):
                start=1
                if(i=='-'):
                    sign = -1
                elif(i=='+'):
                    sign = 1
                continue
            else:
                if i in dic:
                    s1+=(dic[i])
                    if(sign==0):
                        sign=1
                else:
                    break
                start=1
        if(len(s1)==0):
            s1 = '0'
        s1 = sign*int(s1)
        if(s1>maxval):
            return maxval
        elif(s1<minval):
            return minval
        return s1
            