import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());

            // memoization dp 배열
            int[][] stickers = new int[2][n+1];
            int[][] dp = new int[2][n+1];
            for(int j = 0; j < 2; j++){
                String[] inputs = br.readLine().split(" ");
                for (int k = 1; k <= n; k++) {
                    stickers[j][k] = Integer.parseInt(inputs[k-1]);
                }
            }

	    // 첫번째 column은 자기 자신이 최대이므로 자기 자신으로 초기화
            dp[0][1] = stickers[0][1];
            dp[1][1] = stickers[1][1];

            for (int j = 2; j <= n; j++) {
                // 0번째 행 -> 아래 1번째 행 대각선 밑에거 그 왼쪽 옆에거 비교
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + stickers[0][j];
                // 1번째 행 -> 위 0번째 행 대각선 위에거 그 왼쪽 옆에거 비교
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + stickers[1][j];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }
    }
}
