class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        findPermutations(res, nums, new ArrayList<>(), visited);
        return res;
    }
    
    private void findPermutations(List<List<Integer>> res, int[] nums, List<Integer> current, boolean[] visited) {
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            current.add(nums[i]);
            visited[i] = true;
            findPermutations(res, nums, current, visited);
            visited[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
