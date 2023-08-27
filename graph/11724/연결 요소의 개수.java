import java.util.*;
import java.io.*;

public class Main {
    static int result = 0;
    static boolean visited[];
    static ArrayList<Integer>[] list;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken()) - 1;
            int v2 = Integer.parseInt(st.nextToken()) - 1;

            list[v1].add(v2);
            list[v2].add(v1);
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
        System.out.println(result);
    }

    static void dfs(int now) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(now);
        visited[now] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (Integer next : list[cur]) {
                if (!visited[next]) {
                    q.offer(next);
                    visited[next] = true;
                }
            }
        }

        result++;
    }

}
