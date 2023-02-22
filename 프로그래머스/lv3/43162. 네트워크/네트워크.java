import java.util.*;

class Solution {    
    public int solution(int n, int[][] computers) {
        //그냥 간선으로 이동할 수 있는 노드들은 1로 계산하고 따로 떨어져있는 노드들도 1로 계산해서 모두 더하는 문제
        //dfs에서 visited[] = true 인거랑 = false인거 다 더해줘야 return 값이 맞게 됨
        boolean[] visited = new boolean[n];
        //걍 이렇게 배열 기본형은 visited 다 false로 초기화 되어 있는 거임
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }
        return answer;
    }
    
    boolean[] dfs(int[][] computers, int i, boolean[] visited) {
        visited[i] = true;
        
        for(int j = 0; j < computers.length; j++) {
            if(i != j && computers[i][j] == 1 && visited[j] == false) {
                visited = dfs(computers, j, visited);
            }
        }
        return visited;
    }
}