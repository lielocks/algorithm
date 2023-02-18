import java.util.*;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n+1][m+1]; 
        dp[1][1] = 1;
        int num = 1000000007;
        
        for(int i = 0; i < puddles.length; i++) { //웅덩이는 여러 군데가 존재할 수 있음 주의
            int x = puddles[i][1];
            int y = puddles[i][0];
            dp[x][y] = -1;
        }
        
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < m+1; j++) {
                if(dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }
                if(!(i==1 && j==1)) { //dp[1][1]이 아니라면 -> 출발점이 아니라면
                    int left = 0;
                    int up = 0;
                    if(j > 1) {
                        left = dp[i][j-1];
                    }
                    if(i > 1) {
                        up = dp[i-1][j];
                    }
                    dp[i][j] = (left + up) % num;
                }
            }
        }
        
        return dp[n][m];
    }
}