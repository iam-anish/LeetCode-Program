class Solution {
    public int differenceOfSum(int[] nums){
        int elSum = 0;
        int digSum = 0;
        
        for(int i=0;i<nums.length;i++){
            elSum += nums[i];
            while(nums[i]!=0){
                digSum += nums[i]%10;
                nums[i] /= 10; 
            }
        }
        return Math.abs(elSum-digSum);
    }
}
