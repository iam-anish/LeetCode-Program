class Solution {
    public int missingNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean f = false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    f=true;
                }
            }
            if(f==false){
                 return i;
            }
        }
        return nums.length;
    }
}
