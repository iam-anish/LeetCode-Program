class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> a = new ArrayList<>();
        int i=0,j=0;
        if(nums1.length==0 || nums2.length==0){
            return new int[1];
        }
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                a.add(nums1[i]);
                i++;j++;
            }
        }
        int ans[] = new int[a.size()];
        for(i=0;i<a.size();i++){
             ans[i] = a.get(i);
        }
        return ans;
    }
}
