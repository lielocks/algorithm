import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	static int n;
	static long D[] = new long[91];
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		D[0] = 0;
		D[1] = 1;
		
		for (int i = 2; i <= n; i++)
		{
			D[i] = D[i-1] + D[i-2];
		}
		
		System.out.println(D[n]);
	}
}