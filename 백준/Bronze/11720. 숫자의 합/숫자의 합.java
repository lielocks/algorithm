import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int sum = 0;

        for (int i = 0; i < b.length(); i++ ) {
            sum += b.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}