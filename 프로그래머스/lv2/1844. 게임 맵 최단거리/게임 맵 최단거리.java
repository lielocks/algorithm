import java.util.*;

class Solution {
    
        int[][] maps, visited;
        int m, n;
        int[] dy = {0, 0, 1, -1};
        int[] dx = {1, -1, 0, 0};

        public void bfs(){
            visited[0][0] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0, 0});

            while(!queue.isEmpty()) {
                /**
                 * 이 로직이랑 비슷함 ! Node라는 class를 위에서 만들고
                 * Node now = queue.poll(); x = now.getY(); y = now.getX();
                 */
                int[] curr = queue.remove();
                int y = curr[0];
                int x = curr[1];

                //일단 젤 첫번째로 for문을 먼저 돌겠지 다음으로 위에 while문 돌면서 queue.remove()하게됨
                for(int i = 0; i < 4; i++) { //다음 좌표를 하나씩 계산하기 위함

                    //다음 x, y좌표 계산
                    int ny = y + dy[i];
                    int nx = x + dx[i];

                    /**
                     * 배열을 벗어나는 경우에 대해서 continue로 스킵하거나
                     * if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                     *
                     * 배열이 벗어나지 않는 범위를 정해서 그 내부로 로직을 계속 진행.
                     * if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                     * }
                     */
                    if(ny >= m || ny < 0 || nx >= n || nx < 0) {
                        continue; //continue = skip 이다
                    }
                    //아직 visitied 하지 않았음 & maps에서의 위치는 1로 갈 수 있는 길일때

                    if(visited[ny][nx] == 0 && maps[ny][nx] == 1) {
                        visited[ny][nx] = visited[y][x] + 1;
                        queue.add(new int[]{ny, nx});
                    }

                }

            }
        }

        public int solution(int[][] maps) {
            int answer = 0;
            m = maps.length; //가로줄 행
            n = maps[0].length; //갯수 열
            visited = new int[m][n]; //n행 m열 근데 m을 x축으로 봐야 한다 2차원배열은 [줄][갯수]니까
            this.maps = maps;

            bfs();
            answer = visited[m-1][n-1] == 0 ? -1 : visited[m-1][n-1];
            return answer;
        }

    }