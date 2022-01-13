class Solution:
    def countAndSay(self, n: int) -> str:
        if(n==1):
            return "1"
        if(n==2):
            return "11"
        s = '11'
        count=1
        for i in range(3,n+1):
            new_s = ''
            s=s+'&'
            for j in range(1,len(s)):
                if(s[j]==s[j-1]):
                    count+=1
                else:
                    new_s+=str(count)
                    new_s+=s[j-1]
                    count=1
            s=new_s
        return s     
            