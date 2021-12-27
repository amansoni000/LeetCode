class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s = ""
        maxi = 201
        c=0
        for i in range(len(strs)-1):
            j=i+1
            l1 = len(strs[i])
            l2 = len(strs[j])
            mini = min(l1,l2)
            for k in range(mini):
                if(strs[i][k]==strs[j][k]):
                    c+=1
                else:
                    break
            maxi = min(maxi,c)
            c=0
        # print(maxi)
        return strs[0][0:maxi]
        