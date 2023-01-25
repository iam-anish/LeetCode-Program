class Solution {
    public int maximumWealth(int[][] accounts){
        int max = 0;
        for(int m=0;m<accounts.length;m++){
            int temp = 0;
            for(int n=0;n<accounts[0].length;n++){
                    temp += accounts[m][n];
            }
            max = Math.max(max,temp);
        }
        return max;
    }
}
