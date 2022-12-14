import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int count = 0;
        int copy = a;

        do {
            int left = copy / 10;
            int right = copy % 10;
            copy = right * 10 + (left + right) % 10;
            count++;
        } while (copy != a); //copy값 a가 아닐때 do문 실행

        br.close();
        System.out.println(count);
    }
}
