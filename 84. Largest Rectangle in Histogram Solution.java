class Solution {
    public int largestRectangleArea(int[] hist) {
        int n = hist.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        int max = 0;
        int curr;
        
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && hist[i] <= hist[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        //next smaller left
        s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && hist[i] <= hist[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        //current area
        for(int i=0;i<n;i++){
            int height = hist[i];
            int weight = nsr[i] - nsl[i] - 1;
            curr = height*weight;
            max = Math.max(max,curr);
        }
        return max;
    }
}
