import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i ++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            list.add(a);
        }

        br.close();
        Integer max = Collections.max(list);

        System.out.println(max + "\n" + (list.indexOf(max) + 1));
    }
}
