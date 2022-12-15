import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < a; i++) {
                int c = Integer.parseInt(st.nextToken());
                if (c < b) {
                    sb.append(c).append(" ");
                }
            }

        System.out.println(sb);
        br.close();

    }
}