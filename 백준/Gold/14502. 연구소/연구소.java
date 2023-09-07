import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int map[][] = new int[8][8];
    public static int X;
    public static int Y;
    public static int max = Integer.MIN_VALUE; // max 값을 초기화해야 합니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Y = sc.nextInt();
        X = sc.nextInt();

        // 맨 윗줄이 y값이 Y-1 좌표부터 시작하니까
        for (int y = Y - 1; y >= 0; y--) {
            // 왼쪽부터 x값을 받으니까 0부터 시작
            for (int x = 0; x < X; x++) {
                map[x][y] = sc.nextInt();
            }
        }
        
        recursive(0);
        if (max == Integer.MIN_VALUE) {
            max = 0; // max 값이 초기화된 상태면 모든 경우가 벽을 세운 경우입니다.
        }
        System.out.println(max);
    }

    public static void recursive(int index) {
        if (index == 3) {
            // 바이러스 퍼뜨려본다
            int countOf0 = bfs();
            max = Math.max(max, countOf0); // 최대값을 찾는 게 맞습니다.
            return;
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    recursive(index + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static int dx[] = new int[]{0, 0, 1, -1};
    public static int dy[] = new int[]{1, -1, 0, 0};

    public static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] check = new boolean[X][Y];

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (map[i][j] == 2) {
                    q.add(new int[]{i, j});
                    check[i][j] = true;
                }
            }
        }

        while (!q.isEmpty()) {
            int list[] = q.poll();
            int curx = list[0];
            int cury = list[1];

            for (int i = 0; i < 4; i++) {
                int nx = curx + dx[i];
                int ny = cury + dy[i];
                if (0 <= nx && nx < X && 0 <= ny && ny < Y && !check[nx][ny] && map[nx][ny] == 0) {
                    check[nx][ny] = true;
                    q.add(new int[]{nx, ny});
                }
            }
        }

        // 안전영역의 갯수 구하기
        int count = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (map[i][j] == 0 && !check[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
