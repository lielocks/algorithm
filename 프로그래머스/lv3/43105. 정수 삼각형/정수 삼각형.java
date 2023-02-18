class Solution {
    public int solution(int[][] triangle) {
        //dp 이용 값을 저장해둔다 memoization
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        
        for(int i = 1; i <triangle.length; i++) {
            dp[i][0] = dp[i-1][0] + triangle[i][0]; //맨 왼쪽 값
            
            for(int j = 1; j < i; j++) { //중간값
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
            }
            
            dp[i][i] = dp[i-1][i-1] + triangle[i][i]; //맨 오른쪽 값
        }
        
       int answer = 0;
        
        for(int i = 0; i < triangle.length; i++) {
            answer = Math.max(answer, dp[triangle.length - 1][i]); //마지막 행에서 가장 큰 값
        }
        return answer;
        
    }
}