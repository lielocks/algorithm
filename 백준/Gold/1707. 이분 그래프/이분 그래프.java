import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main { // 이분그래프

    static ArrayList<Integer>[] A; // 그래프 데이터 저장 인접리스트
    static boolean[] visited;
    static int[] check;
    static boolean isEven;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //입력은 여러 개의 테스트 케이스로 구성되어 있는데, 첫째 줄에 테스트 케이스의 개수 K가 주어진다.
        int testCase = Integer.parseInt(br.readLine());
        for(int t = 0; t < testCase; t++) {
            //각 테스트 케이스의 첫째 줄에는 그래프의 정점의 개수 V와 간선의 개수 E가 빈 칸을 사이에 두고 순서대로 주어진다.
            st = new StringTokenizer(br.readLine());

            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            A = new ArrayList[V + 1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            isEven = true;

            for (int i = 1; i <= V; i++) {
                A[i] = new ArrayList<Integer>();
            }

            // 엣지 데이터 저장하기
            for (int i = 0; i < E; i++) {
                StringTokenizer str = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(str.nextToken());
                int end = Integer.parseInt(str.nextToken());

                A[start].add(end);
                A[end].add(start);
            }

            // 모든 노드에서 DFS 실행해야 함
            for (int i = 1 ; i <= V; i++) {
                if (isEven) {
                    DFS(i);
                } else {
                    break;
                }

            }

            if (isEven) System.out.println("YES");
            else System.out.println("NO");
        }


    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) { // 인접 리스트로 받아서 start 에서 연결된 모든 노드 탐색
            if (!visited[i]) {
                // 바로 직전에 있는 노드와 다른 집합으로 분류를 해주는것
                check[i] = (check[start] + 1) % 2; // 1 0 1 0 1 0 으로 인접구분 like 돌다리 A B A B
                DFS(i);
            } else if (check[start] == check[i]) {
                isEven = false;
            }
        }
    }

}