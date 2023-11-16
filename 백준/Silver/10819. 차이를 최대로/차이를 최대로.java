import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[] arr;
    static int answer = 0;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        dfs(0, 0, 0);
        System.out.println(answer);
    }

    public static void dfs(int cnt, int bf, int sum) {
        if (cnt == N) {
            answer = Math.max(answer, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(cnt+1, arr[i], cnt==0 ? 0 : sum + Math.abs(bf - arr[i]));
            visited[i] = false;
        }
    }

}