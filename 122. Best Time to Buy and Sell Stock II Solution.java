class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for(int i=1; i<prices.length; i++) {
            int dif = prices[i] - prices[i-1];
            if(dif > 0) ans += dif;
        }
        
        return ans;
    }
}
