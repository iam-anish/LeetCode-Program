class Solution {
    public int[] distributeCandies(int n, int num_people) {
        int[] nums = new int[num_people];
        int i=0;
        int givenCandies=0;
        int candies=1;
        while(true){
            if(i==num_people) i=0;
            if(givenCandies+candies<=n){
                nums[i++]+=candies++;
                givenCandies+=candies-1;
            }else{
                nums[i]+=n-givenCandies;
                break;
            }
        }
        return nums;
    }
}
