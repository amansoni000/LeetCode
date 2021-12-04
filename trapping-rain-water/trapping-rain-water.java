class Solution {
    public int trap(int[] arr){
        // Your code here
        int n=arr.length;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        // int i=0,j=n-1;
        int max_left = arr[0];
        int max_right = arr[n-1];
        int diff;
        int water=0;
        ls.add(0);
        for(int i=1,j=n-1;i<n&&j>0;i++,j--){
            max_left = Math.max(max_left,arr[i-1]);
            ls.add(max_left);
        }
        // System.out.print(ls);
        int last = 0;
        for(int j=n-2;j>0;j--){
            if(last==0){
                max_right=0;
                ls.set(n-1,Math.min(max_right,ls.get(j)));
                last++;
            }
            max_right = Math.max(max_right,arr[j+1]);
            if(last==0){
                max_right=0;
                last++;
            }
            ls.set(j,Math.min(max_right,ls.get(j)));
        }
        for(int i=0;i<n;i++){
            diff = ls.get(i)-arr[i];
            ls.set(i,diff);
        }
        for(int i=0;i<n;i++){
            if(ls.get(i)>0){
                water+=ls.get(i);
            }
        }
        
        
        // System.out.print(ls);
        return water;
    }
    
}