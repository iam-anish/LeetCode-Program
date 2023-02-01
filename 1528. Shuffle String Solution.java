class Solution {
    public String restoreString(String s, int[] indices){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<indices.length;i++){
            sb.replace(indices[i],indices[i]+1,Character.toString(s.charAt(i)));
        }
        return sb.toString();
    }
}
