import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= count; i++) {

            for (int j = 1; j <= count - i; j++) {
                bf.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bf.write("*");
            }
            bf.newLine();

        }

        bf.flush();
        bf.close();
    }
}
