import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static void ZeroCount(int n, int m) {
		int count =0;
		char[] temp= {};
		for(int i=n;i<=m;i++) {
			temp = String.valueOf(i).toCharArray(); 
			//문자열로 저장시킬때 10 -> '1' | '0' 이렇게 하나씩 끊어서 저장된다!
			for(int j=0; j<temp.length;j++) {
				if(temp[j]=='0') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) throws IOException {
		int number = Integer.parseInt(in.readLine());
		while(number > 0) {
			st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ZeroCount(n, m);
			
			number--;
		}
	}
	
     
}
