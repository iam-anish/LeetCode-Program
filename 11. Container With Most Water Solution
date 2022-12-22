class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int Lp=0,Rp = height.length-1;
        while(Lp<=Rp){
            int ans = Math.min(height[Lp],height[Rp])*(Rp-Lp);
            max = Math.max(max,ans);
            if(height[Lp]<height[Rp]){
                Lp++;
            }
            else{
                Rp--;
            }
        }
        return max;
    }
}
