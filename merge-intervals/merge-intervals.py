class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        l=len(intervals)
        arr=[]
        intervals.sort()
        arr.append(intervals[0])
        print(arr[-1][1])
        for i in range(1, len(intervals)): 
            
            # There is intersection, then update the last sub-list of result
            if intervals[i][0] <= arr[-1][1]:  
                arr[-1][1] = max(arr[-1][1], intervals[i][1])
                
                
            else:
                arr.append(intervals[i])
        return arr
    