class Solution {
    public List<List<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int sum=0,start=0,end=0;
        int len = arr.length;
        for(int i=0;i<len-3;i++){
            for(int j=i+1;j<len-2;j++){
                start = j+1;
                end = len-1;
                while(start<end){
                    sum = arr[i]+arr[j]+arr[start]+arr[end];
                    if(sum>k){
                        end--;
                    }
                    else if(sum<k){
                        start++;
                    }
                    else{
                        ArrayList<Integer> list1 = new ArrayList<>();
                        list1.add(arr[i]);
                        list1.add(arr[j]);
                        list1.add(arr[start]);
                        list1.add(arr[end]);
                        if(!list.contains(list1))
                        {
                            list.add(list1);
                        }
                        start++;
                        end--;
                    }
                }
            }
        }
        return list;
    }
}