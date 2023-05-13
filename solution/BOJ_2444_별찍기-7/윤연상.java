import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int n = Integer.parseInt(in.readLine());
			
			for(int i=1;i<=2*n-1;i++) {	// 총 줄수 : 2n-1
				StringBuilder sb = new StringBuilder();
				
				int spaceCnt = Math.abs(n-i);	// 공백 개수
				int starCnt = (i<=n) ? 2*i-1 : 2*(2*n-i)-1;	// 별 개수
				
				for(int j=0;j<spaceCnt;j++)
					sb.append(" ");
				for(int j=0;j<starCnt;j++)
					sb.append("*");
				sb.append("\n");
				out.write(sb.toString());
			}
			
			out.flush();
		} catch (Exception e) {}
	}
}
