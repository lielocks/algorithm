import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < a; i++) {

            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            arr = new int[b];
            double sum = 0;


            for (int j = 0; j < b; j++) {
                int c = Integer.parseInt(st.nextToken());
                arr[j] = c;
                sum += c;
            }

            double avg = sum / b;
            double count = 0;

            for (int x = 0; x < b; x++) {
                if (arr[x] > avg) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/b)*100);
        }

    }
}
