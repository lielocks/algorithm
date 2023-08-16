import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);

    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // 1. 여는 괄호 ( 이면 스택에 push
            if (c == '(') {
                stack.push(c);
            }

            // 2. ) 닫는 괄호 일때
            // 2-1. 스택 비어있는 경우, 닫는 괄호 ) 입력받았으나 pop할 원소 없을때
            else if (stack.isEmpty()) {
                return "NO";
            }
            // 2-2. 그 외의 경우 stack 원소 pop
            else {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}