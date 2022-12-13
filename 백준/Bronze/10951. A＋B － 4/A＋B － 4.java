import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        while ( (s=br.readLine()) != null ) {

            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - 48;

            sb.append(a+b).append("\n");

        }

        br.close();
        System.out.println(sb);
    }
}
