import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;

        int max = -1;
        double sum = 0.0;

        for (int i = 0; i < a; i++) {
            
            int b = Integer.parseInt(st.nextToken());

            if (b > max) {
                max = b;
            }

            sum += b;

        }

        System.out.println(((sum / max) * 100.0) / a);

    }
}
