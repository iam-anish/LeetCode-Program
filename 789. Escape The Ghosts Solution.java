class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int c = Math.abs(target[0]) + Math.abs(target[1]);
        for(int i = 0;i<ghosts.length;i++){
            int x = Math.abs(ghosts[i][0] - target[0]) + Math.abs(ghosts[i][1] - target[1]);
            if(x <= c)
                return false;
        }
        return true;
    }
}
