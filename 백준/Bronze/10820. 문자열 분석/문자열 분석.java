import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        String input = "";
 
        while ((input = br.readLine()) != null ) {
 
            int[] arr = new int[4];
 
            for (int i = 0; i < input.length(); i++) {
 
                // 소문자
                if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    arr[0] += 1;
                }
                // 대문자
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    arr[1] += 1;
                }
                // 숫자
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                    arr[2] += 1;
                }
                // 공백
                if (input.charAt(i) == ' ') {
                    arr[3] += 1;
                }
 
            }
 
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.write('\n');
 
            bw.flush();
        }
 
    }
 
}