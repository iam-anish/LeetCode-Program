class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String str = "";
        int idx = 0;

        while(idx<s.length()){

            //is number
            if(Character.isDigit(s.charAt(idx))){
                int count = 0;
                while(Character.isDigit(s.charAt(idx))){
                    count = count*10 + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            //is "["
            else if(s.charAt(idx)=='['){
                strStack.push(str);
                str = "";
                idx++;
            }
           //is "]"
           else if(s.charAt(idx)==']'){
               StringBuilder sb = new StringBuilder(strStack.pop());
               int intcount = countStack.pop();
               for(int i=0;i<intcount;i++){
                   sb.append(str);
               }
               str = sb.toString();
               idx++;
           }
           //is char
           else{
               str += s.charAt(idx);
               idx++;
           }
        }
    return str;
    }
}
