class Solution {
    public int finalValueAfterOperations(String[] operations){
        int x = 0;
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("++X")){
                ++x;
            }
            else if(s.equals("X++")){
                x++;
            }
            else if(s.equals("--X")){
                --x;
            }
            else{
                x--;
            }
        }
        return x;
    }
}
