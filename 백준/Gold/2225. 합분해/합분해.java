import java.util.*;
 
public class Main {    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long mod = 1000000000;
        
        int n = scan.nextInt();
        int k = scan.nextInt();
        
        long dp[][] = new long[n + 1][k + 1];
        for(int i = 0; i < n + 1; i++) {
            dp[i][1] = 1; //정수 1개를 더해서 i를 만드는 경우의 수는 하나밖에 없다. 
        }
        for(int i = 1; i < k + 1; i++) {
            dp[0][i] = 1; //정수 0을 i개 사용해서 0을 만드는 경우의 수는 0, 00, 000... 하나밖에 없다.
        }
        
        
        for(int i = 1; i <= n; i++) {
            for(int j = 2; j <= k; j++) {
                dp[i][j] = (dp[i][j - 1] + dp[i - 1][j]) % mod;
            }
        }
        System.out.println(dp[n][k] % mod);
    }    
}
