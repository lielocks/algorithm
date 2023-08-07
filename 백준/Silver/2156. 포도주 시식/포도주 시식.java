import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    
    /**
     * 1. i번째 포도주 잔을 마시지 않는 경우: dp[i] = dp[i - 1]
     * 2. i번째 포도주 잔을 마시는 경우
     * 2 - 1. 이전 포도주를 마시지 않은 경우(i - 1번째 포도주를 마시지 않음): dp[i] = dp[i - 2] + arr[i]
     * 2 - 2. 이전 포도주를 마신 경우(i - 1번째 포도주를 마심): dp[i] = dp[i - 3] + arr[i - 1] + arr[i]
     */
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		int[] arr = new int[N + 1];
		int[] dp = new int[N + 1];
 
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		dp[1] = arr[1];
		if (N > 1) {
			dp[2] = arr[1] + arr[2];
		}
		for (int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]));
 
		}
		System.out.println(dp[N]);
	}
 
}