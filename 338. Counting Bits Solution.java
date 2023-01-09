class Solution {
    public int[] countBits(int n) {
       int i=0;
       int count[] = new int[n+1];
       int tempCount = 0;
       while(i<=n){
           int m = i;
           tempCount = 0;
           while(m>0){
               if((m&1)!=0){
                   tempCount++;
               }
               m = m>>1;
           }
           count[i] = tempCount;
           i++;
       } 
       return count;
    }
}
