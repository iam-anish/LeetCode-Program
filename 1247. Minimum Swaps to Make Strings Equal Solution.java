class Solution {
    public int minimumSwap(String s1, String s2) {
        if(s1.length() != s2.length()) return -1;
        int xy=0;
        int yx=0;
        int x=0;
        int y=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == 'x'){
                x++;
                if(s2.charAt(i) == 'y'){
                    y++;
                    xy++;
                }
                else x++;
            }

            else{
                y++;
                if(s2.charAt(i)=='x'){
                    x++;
                    yx++;
                }
                else y++;
            }
        }
        if(x%2 != 0 || y%2 != 0) return -1;
        return xy/2 + yx/2 + xy%2 + yx%2;

    }
}
