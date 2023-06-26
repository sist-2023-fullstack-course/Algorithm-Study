import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
/*
 * 시간 복잡도
 * draw() 메소드는 O(n^2)의 복잡도를 갖고 있다 k번수행하므로
 * O(k*n^2) -> O(n^2)의 복잡도
 * 
 */

public class Main {
	 static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	 static StringTokenizer st;
	 static boolean dowhaji[][] = new boolean[101][101];
	 static int garo, sero, total;
	 
	 public static void draw() {
		 
		 for (int i = sero; i < sero+10; i++) {
             for (int j = garo; j < garo+10; j++) {
                 if (!dowhaji[i][j]) {
                     dowhaji[i][j] = true;
                     total++;
                 }
             }
         }
	 }
	 
	 public static void main(String[] args) {
		 try {
			 int n = Integer.parseInt(in.readLine());
			 
			 for(int i=0;i<n; i++) {
				 st = new StringTokenizer(in.readLine());
				 garo = Integer.parseInt(st.nextToken());
				 sero = Integer.parseInt(st.nextToken());
				 draw();
			 }
			 System.out.println(total);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
