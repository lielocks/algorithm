import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                }

        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                count++;
            }
        }

        System.out.println(count);
        br.close();

    }
}
