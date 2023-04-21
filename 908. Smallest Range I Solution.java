class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = 10001, max = -1;
        // 'max - k' would give us the minimum max
        // 'min + k' would give us the maximum min
        // Their difference would give us the minimum score (difference)
        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int ans = (max - k) - (min + k);
        return Math.max(0, ans);
    }
}
