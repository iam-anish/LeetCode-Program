class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[] = new int[mat.length];
        int idx[] = new int[k];
        for(int i=0;i<mat.length;i++){
            int start = 0;
            int end = mat[0].length-1;
            int mid = start + (end-start)/2;
            while(start<=end){
                mid = start + (end-start)/2;
                if(mat[i][mid]==1){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            if(mat[i][mid]==0){
                ans[i] = (mid*1000)+i;
            }
            else{
                ans[i] = (mid+1)*1000+i;
            }
        }
        Arrays.sort(ans);
        for(int i=0;i<k;i++){
              idx[i] = ans[i]%1000;
        }
        return idx;
    }
}
