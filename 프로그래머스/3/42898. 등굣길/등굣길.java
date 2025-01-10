import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int mod = 1000000007;
        int[][] map = new int[n + 1][m + 1];
        map[1][1] = 1;
    
        for (int[] p : puddles) {
            map[p[1]][p[0]] = -1;
        }
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if (map[i][j] == -1) {
                    map[i][j] = 0;
                    continue;
                }
                
                if(i > 1) { // 위쪽에서 오는 경우
                    map[i][j] += map[i - 1][j] % mod;
                }
                
                if(j > 1) { // 왼쪽에서 오는 경우
                    map[i][j] += map[i][j - 1] % mod;
                }
            }
        }
        
        return map[n][m] % mod;
    }
}