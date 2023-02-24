import java.util.*;

class Solution {
    int answer = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        return answer;
    }
    
    public void dfs(int depth, int k, int [][] dungeons) {
        for(int i = 0; i < dungeons.length; i++) {
            //방문한 적이 없고, 현재 피로도가 필요 피로도보다 높다면 점화식을 수행하게 된다.
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                //재귀 함수 내에서 depth +1 을 인자로 보내게 되는데, 이때 depth++을 사용했다면, dfs 재귀 호출 다음 줄에서 depth--하지 않으면 틀린다. 
                //depth++, depth--의 경우 depth 변수 자체의 값을 변화시킨채 유지 되기 때문이다.
                dfs(depth+1, k-dungeons[i][1], dungeons); 
                //이렇게 계속 재귀를 도니까 k-dungdeons[i][1] 값은 계속 빠진값이 알아서 memoization 누적되는 것임
                visited[i] = false;
                //if문을 돌게 해야하니까 false 조건문을 맞춰줌
            }
        }
            answer= Math.max(answer, depth);
    }
    
}