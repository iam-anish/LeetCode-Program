public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums.length == 1) return true;
        int su = 0;
        for (int i: nums) su += i;
        int res = ans(nums, 0, nums.length - 1);
        if (res < (su - res)) return false;
        return true;
    }
    public static int ans(int[] nums, int left, int right) {
        if (left > right) return 0;
        int choice1 = nums[left] + Math.min(ans(nums, left + 2, right), ans(nums, left + 1, right - 1));
        int choice2 = nums[right] + Math.min(ans(nums, left + 1, right - 1), ans(nums, left, right - 2));
        return Math.max(choice1, choice2);
    }
}
