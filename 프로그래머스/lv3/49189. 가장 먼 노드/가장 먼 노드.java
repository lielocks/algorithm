import java.util.*;

class Solution {
    
    ArrayList<Integer>[] graph; //인접리스트
    boolean[] visited;
    int[] dist;
    int max = Integer.MIN_VALUE;
    
    public int solution(int n, int[][] edge) {
        input(n, edge);
        bfs();
        int cnt = 0;
        for(int i : dist) {
            if(i == max) {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    //bfs 사용 
    public void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        dist[1] = 0;
        
        while(!q.isEmpty()) {
            int k = q.poll();
            
            for(Integer x : graph[k]) {
                if(!visited[x]) {
                    q.offer(x);
                    visited[x] = true;
                    dist[x] = dist[k] + 1;
                    max = Math.max(max, dist[x]);
                }
            }
        }
    }
    
    public void input(int n, int[][] edge) {
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        dist = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < edge.length; i++) {
            int x = edge[i][0];
            int y = edge[i][1];
            
            graph[x].add(y);
            graph[y].add(x);
            }
        }

}
