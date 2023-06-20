import java.io.*;
import java.util.StringTokenizer;

/*
 * 배열갯수 N 반복횟수 M
 * 범위 i ~ j 입력값 k // 배열 슬라이싱
 * 시간복잡도 특정 범위(i j를 갖는 for문)을 j-i회 반복*M 을한다 O(Mn) -> O(n)
 */

public class Main {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int[] arr;
	
	static public void insertball(int loop) {
		try {
			while(loop-- > 0) {
				st = new StringTokenizer(in.readLine());
				int i = Integer.parseInt(st.nextToken());
				int j = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				for(int st=i-1; st<=j-1; st++) {
					arr[st]=k;
				}
			}
			for(int i=0; i<arr.length;i++) {
				//System.out.print(arr[i]+" ");
				//out.write(String.valueOf(arr[i])+"\n");
				out.write(Integer.toString(arr[i])+" ");
			}
			out.flush();
		} catch (Exception ex) {
			ex.printStackTrace();a
		}
		
	}
	
	public static void main(String[] args) throws IOException{
		st = new StringTokenizer(in.readLine());
		int num = Integer.parseInt(st.nextToken());
		int loop = Integer.parseInt(st.nextToken());
		arr= new int[num];
		
		insertball(loop);
		
	}
	
}
