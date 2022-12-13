import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                bf.write("*");
            }
            bf.newLine();
        }

        br.close();

        bf.flush();
        bf.close();
    }
}