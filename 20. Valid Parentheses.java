class Solution {
    public boolean isValid(String s){
        Stack<Character> sk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{'){
                sk.push(a);
            }
            else{
               //if first closing bracket come
               if(sk.isEmpty()){
               return false;
               }  
               if((sk.peek()=='(' && a==')') ||
                  (sk.peek()=='[' && a==']') ||
                  (sk.peek()=='{' && a=='}')){
                   sk.pop();
               } 
               else{
                   return false;
               }
            }
        }
        if(sk.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
