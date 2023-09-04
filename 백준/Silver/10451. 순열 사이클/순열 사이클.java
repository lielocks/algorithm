import java.io.*;
import java.util.*;

public class Main {

	static int[] parents;
	static int cycle;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int test = 0; test < t; test++) {
			int n = Integer.parseInt(br.readLine());
			parents = new int[n + 1];
			cycle=0;
			for(int i=1; i<n+1; i++) {
				parents[i] = i;
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i < n+1; i++) {
				int a = i;
				int b = Integer.parseInt(st.nextToken());
				union(a,b);
			}
			sb.append(cycle+"\n");
		}
		System.out.println(sb.toString());
	}
	
	
	static int find(int x) {
		if(parents[x] == x) return x;
		
		int parent= find(parents[x]);
		return parent;
		
	}
	
	static void union(int x, int y) {
		x = find(x);
		y = find(y);

		if(x==y) {
			cycle++; // 싸이클 생성
		}
		else if(x>y) {   
			parents[x]= y;
			
		}else {
			parents[y] = x;  
			
		}
	}
}