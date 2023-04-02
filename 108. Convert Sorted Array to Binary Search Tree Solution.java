class Solution {
    public TreeNode sort(int[] nums,int st,int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sort(nums,st,mid-1);
        root.right = sort(nums,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums,0,nums.length-1);
    }
}
