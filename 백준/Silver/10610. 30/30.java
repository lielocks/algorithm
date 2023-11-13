import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nStr = br.readLine();
		int sum = 0;

		// 해당 숫자 재배치 시작
		char[] ch = nStr.toCharArray();
		Arrays.sort(ch);	// 오름차순 정렬
		int len = ch.length;

		StringBuilder sb = new StringBuilder();
		// 오름차순 정렬이므로, 맨 끝 원소부터 반대로 탐색
		for(int i = len - 1; i >= 0; i--) {
			int num = ch[i] - '0';
			sum += num;
			sb.append(num);
			
		}
				
		if(ch[0] != '0' || sum % 3 != 0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
}