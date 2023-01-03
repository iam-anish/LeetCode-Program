class Solution {
    public int maxSubArray(int[] arr) {
        int cur = 0;
          int max = 0;
          for(int i=0;i<arr.length;i++){
              cur = cur + arr[i];
              if(cur<0){
                  cur = 0;
              }
              if(cur>max){
                  max = cur;
              }
          }
          if(max==0){
            int max2 = Integer.MIN_VALUE;  
            for(int i=0;i<arr.length;i++){
                if(max2<arr[i]){
                    max2 = arr[i];
                }
            } 
            return max2;
          }
          return max;
    }
}
