class Solution {
    public boolean detectCapitalUse(String word) {
        boolean f = false;
        int count = 0;
        int i = 1;
        int check =0;
        check = word.charAt(0);
        if(check>=65 && check<=90){
            f = true;
            count++;
        }
        while(i<word.length()){
             check = word.charAt(i);
            if(check>=65 && check<=90){
                count++;
            }
            i++;
        }
        if(count==0||count==word.length()||(f&&count==1)){
            return true;
        }
        else{
            return false;
        }
    }
}
