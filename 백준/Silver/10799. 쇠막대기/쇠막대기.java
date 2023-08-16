import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        Stack<Character> stack = new Stack<>();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            // 열린 괄호 ( 면 push
            if (input.charAt(i) == '(') { 
                stack.push('(');
            }
            // 닫힌 괄호 ) 일 경우
            if (input.charAt(i) == ')') { 
                stack.pop();
                // 그 전 괄호가 열린 괄호 ) => 레이저
                if (input.charAt(i - 1) == '(') {
                    // 현재 stack 사이즈만큼 +
                    result += stack.size(); 
                }
                // 그 전 괄호가 닫힌 괄호면 레이저 x 1만 +
                else { 
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}
