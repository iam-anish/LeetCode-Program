class Solution {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum+=HammingDistance(nums[i],nums[j]);
            }
        }
        
        return sum;
    }
    
    public int HammingDistance(int a ,int b ){
        return Integer.bitCount(a^b);
    }
}
