import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] task = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            task[a] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if (task[i] == false) {
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
        
    }
}