class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int leftSum[]=new int[nums.length];
        int rightSum[]=new int[nums.length];
        int ans[]=new int [nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                sum+=nums[j];
            }
            leftSum[i]=sum;
        }
        for(int i=nums.length-1;i>=0;i--){
            int sum=0;
            for(int j=i-1;j>=0;j--){
                sum+=nums[j];
            }
            rightSum[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }
}
