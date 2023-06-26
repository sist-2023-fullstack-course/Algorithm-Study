import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 이중 포문 O(n^2)이 2개 있다.
 * -> O(n^2)
 * 
 */
public class Main {
	 static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	 static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	 static char[][] sentence = new char[5][15];
	 static int max=0;
	 
	 
	 
	 public static void main(String[] args) {
		 try {
			 
			 for(int i=0;i<5;i++) {
				 String a = in.readLine();
				 max = Math.max(max, a.length()); //문자열에 최대길이 값을 구한다 -> 출력문에서 반복횟수를 줄이기 위해 사용
				 for(int j=0; j<a.length();j++) {
					 sentence[i][j] = a.charAt(j);
				 }
			 }
			 
			 for(int i=0;i<max;i++) {
				 for(int j=0; j<5;j++) {
					 if(sentence[j][i]=='\0') {//각행의 끝을 만나면 반복을 중단하고 다음 반복으로 넘긴다.
						 continue;
					 }
					 out.write(sentence[j][i]);
				 }
			 }
			 
			 out.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
