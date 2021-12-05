class Solution {
    public void sortColors(int[] a) {
            int n=a.length;
            int a1=0;
            int b1=2;
            int temp;
            int j=0;
            for(int i=0;i<n;i++){
                if(a[i]<=a1){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]>a1&&a[i]<b1){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]>=b1){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    j++;
                }
            }
        }
}