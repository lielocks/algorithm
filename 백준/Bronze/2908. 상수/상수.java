import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (flip(a) >flip(b)) {
            System.out.println(flip(a));
        } else {
            System.out.println(flip(b));
        }
    }

        public static int flip(int num) {
            int result = 0;
            while (num != 0) {
                result = result * 10 + num % 10;
                num /= 10;
            }
            return result;
        }
    }
