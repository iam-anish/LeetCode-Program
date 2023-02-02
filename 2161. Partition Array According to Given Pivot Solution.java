class Solution{
    public int[] pivotArray(int[] nums, int pivot){
        int res[] = new int[nums.length];
        int gPoint = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=pivot){
                 gPoint++;
            }
        }
        int lessPoint = 0;
        int equPoint = gPoint-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < pivot){
                res[lessPoint] = nums[i];
                lessPoint++;
            }else if(nums[i] > pivot){
                res[gPoint] = nums[i];
                gPoint++;
            }else{
                res[equPoint] = nums[i];
                equPoint--;
            }
        }
        return res;
    }
}
