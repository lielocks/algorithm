import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int answer = 0;
        int[][] map = new int[101][101];  // 2배 확장된 크기의 맵
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[101][101];
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 2배 크기로 직사각형 테두리 그리기
        for (int[] rect : rectangle) {
            int x1 = rect[0] * 2;
            int y1 = rect[1] * 2;
            int x2 = rect[2] * 2;
            int y2 = rect[3] * 2;

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    if (map[i][j] == 2) continue;
                    map[i][j] = 2;
                    if (i==x1 || i==x2 || j==y1 || j==y2) {
                        map[i][j] = 1;
                    }
                }
            }
            
        }

        queue.offer(new int[]{characterX * 2, characterY * 2});
        visited[characterX * 2][characterY * 2] = true;

        while (!queue.isEmpty()) {
            int size = queue.size(); 

            for (int i = 0; i < size; i++) {
                int[] currentNode = queue.poll();
                int currentX = currentNode[0];
                int currentY = currentNode[1];

                if (currentX == itemX * 2 && currentY == itemY * 2) {
                    return answer / 2;
                }

                for (int j = 0; j < 4; j++) {
                    int nx = currentX + dx[j];
                    int ny = currentY + dy[j];
                    if (nx >= 0 && nx < 101 && ny >= 0 && ny < 101 && map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
            
            answer++;
        }

        return -1;
    }
}
