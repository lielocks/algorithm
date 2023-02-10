import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '(') {
                stack.push('(');
            }
            
            else { // ')' 일때
                if(stack.isEmpty()) {
                    return false;
                } 
             else stack.pop(); //
            }
            
        }

        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }
}