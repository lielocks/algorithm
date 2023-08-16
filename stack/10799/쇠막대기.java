import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int open = 0;
        int answer = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // 열린 괄호 ( 면 push
            if (c == '(') {
                open++;
            }
            // 닫힌 괄호 ) 일 경우
            else {
                open--;
                // 그 전 괄호가 열린 괄호 ) => 레이저
                if (input.charAt(i - 1) == '(') {
                    answer += open; 
                }
                // 그 전 괄호가 닫힌 괄호면 레이저 x 1만 +
                else { 
                    answer++; 
                }
            }
        }

        System.out.println(answer);
    }

}

