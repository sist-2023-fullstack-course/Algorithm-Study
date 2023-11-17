import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int[][] paper;
	private static int white = 0;
	private static int blue = 0;
	
	// 4 8 => 4 6 6 8
	
	static void solve(int r1, int c1, int r2, int c2) {
		int sum = 0;
		for(int i=r1;i<r2;i++) {
			for(int j=c1;j<c2;j++) {
				sum += paper[i][j];
			}
		}
		
		if(sum == 0) {
			white++;
			return;
		} else if(sum == (r1 - r2) * (c1 - c2)) {
			blue++;
			return;
		}
		
		int rm = (r1 + r2) / 2;
		int cm = (c1 + c2) / 2;
		solve(r1, c1, rm, cm);
		solve(r1, cm, rm, c2);
		solve(rm, c1, r2, cm);
		solve(rm, cm, r2, c2);
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		
		paper = new int[n][n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			for(int j=0;j<n;j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		solve(0, 0, n, n);
		out.write(white + "\n");
		out.write(blue + "");
		out.flush();
	}
}
