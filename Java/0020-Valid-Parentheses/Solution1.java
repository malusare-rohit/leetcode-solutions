import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if("([{".indexOf(c)!=-1){
                stack.push(c);
            }
            if(")]}".indexOf(c)!=-1){
                if(!stack.empty() && c==getValue(stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public char getValue(int c){
        switch(c){
            case '(': return ')';
            case '[': return ']';
            case '{': return '}';
            default: return 'n';
        }
    }
}