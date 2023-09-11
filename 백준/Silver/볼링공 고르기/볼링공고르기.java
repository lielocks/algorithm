import java.util.*;

public class Main {

    public static int n, m;
    // 1부터 10까지의 무게를 담을 수 있는 배열
    public static int[] arr = new int[11];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            // 해당 예시에서 m이 3이면 arr[1] = 1, arr[2] = 2, arr[3] = 3
            arr[x] += 1;
        }

        int result = 0;

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= m; i++) {
            // n은 memoization -> 왜냐면 앞에서 이미 고른 쌍인데 중복 선택 불가하기 때문에 앞에서 고른 것들은 다 -해주기
            // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            n -= arr[i]; 
            result += arr[i] * n;
        }

        System.out.println(result);
    }
}
