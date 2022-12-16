import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < a; i++) {
                arr.add(Integer.parseInt(st.nextToken()));
            }

        Integer max = Collections.max(arr);
        Integer min = Collections.min(arr);
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
        br.close();

    }
}
