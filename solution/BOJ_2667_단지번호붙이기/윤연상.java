import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	private static int n;
	private static int[] dr = {0, 0, 1, -1};
	private static int[] dc = {1, -1, 0, 0};
	private static int[][] map;
	private static boolean[][] visited;
	
	static int dfs(int r, int c) {
		int ret = 1;
		
		visited[r][c] = true;
		
		for(int i=0;i<4;i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			
			if(nr >= n || nr < 0 || nc >= n || nc < 0)
				continue;
			else if(map[nr][nc] == 0 || visited[nr][nc])
				continue;
			
			ret += dfs(nr, nc);
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException{
		n = Integer.parseInt(in.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i=0;i<n;i++) {
			String line = in.readLine();
			for(int j=0;j<line.length();j++) {
				map[i][j] = line.charAt(j) - '0';
			}
		}
		
		List<Integer> village = new ArrayList();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					village.add(dfs(i, j));
				}
			}
		}
		
		Collections.sort(village);
		
		out.write(village.size() + "\n");
		for(int i : village) {
			out.write(i + "\n");
		}
		out.flush();
	}
}
