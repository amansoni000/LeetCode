class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        prod=0
        ans=0
        arr = []
        zeros=0
        ones=0
        count=1
        for i in bank:
            l1 = len(i)
            for j in i:
                if(j=='1'):
                    ones+=1
            arr.append(ones)
            ones=0
        for i in range(1,len(arr)+1):
            if(arr[i-1]==0):
                continue
            else:
                ans+=prod*arr[i-1]
                prod=arr[i-1]
        return ans