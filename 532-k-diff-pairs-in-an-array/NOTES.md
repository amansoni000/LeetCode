**2000 ms answer just because i was not able to create condition for end right
class Solution {
public int findPairs(int[] arr, int n) {
Arrays.sort(arr);
int count=0, size = arr.length;
int start = 0, end = 1;
ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
while(start < size && end < size){
// if(start < size && end < size) System.out.println(arr[start]+" "+arr[end]);
if(arr[end] - arr[start] == n && start!=end){
ArrayList<Integer> ls1 = new ArrayList<>();
ls1.add(arr[start]);
ls1.add(arr[end]);
if(!ls.contains(ls1)){
ls.add(ls1);
count++;
}
start++;
end++;
}
else if(arr[end] - arr[start] > n) start++;
else if(arr[end] - arr[start] < n) end++;
if(start==end) end++;
}
// System.out.println();
return count;
}
}**