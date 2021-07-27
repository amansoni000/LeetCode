class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        intervals.append(newInterval)
        print(intervals)
        intervals.sort()
        print(intervals)
        arr=[]
        arr.append(intervals[0])
        print(arr)
        for i in range(1,len(intervals)):
            if intervals[i][0]<=arr[-1][1]:
                arr[-1][1]=max(intervals[i][1],arr[-1][1])
            else:
                arr.append(intervals[i])
        return arr
        