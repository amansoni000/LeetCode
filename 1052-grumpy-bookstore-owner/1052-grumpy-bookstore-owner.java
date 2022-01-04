class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        int cust = customers.length;
        for(int i=0;i<cust;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        int start = 0, end = 0;
        int j = 0, k = 0;
        int sati_in_grum=0;
        int min = Integer.MIN_VALUE;
        for(int i=0; i+minutes-1<cust;i++)
        {
            sati_in_grum=0;
            k=i;
            j = i+minutes-1;
            while(k<=j){
                if(grumpy[k]==1){
                    sati_in_grum += customers[k];
                }
                k++;
            }
            if(sati_in_grum>min){
                
                min = sati_in_grum;
                start = i;
                end = i+minutes-1;
            }
        }
        return satisfied+min;
    }
}