import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        //나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 boolean 배열
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        for (boolean val : arr) {
            if (val) {
                count++;
            }
        }
        System.out.println(count);
    }
}