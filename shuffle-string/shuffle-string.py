class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        s_new=""
        for i in range(len(indices)):
            s_new+=s[indices.index(i)]
        return s_new