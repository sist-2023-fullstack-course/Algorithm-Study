import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		
		BufferedReader br;
		BufferedWriter bw;
		 
		try
		{ 
			br=new BufferedReader(new InputStreamReader(System.in));
			bw=new BufferedWriter(new OutputStreamWriter(System.out));
			int totalline = Integer.parseInt(br.readLine());
			StringTokenizer st;
			
			for(int i=0;i<totalline;i++) {
				//StringTokenizer 두개의 구분문자도 가능 ">:" -> > 또는 : 만나면 새뢔운 토큰 생성
				st = new StringTokenizer(br.readLine()," ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				//개행 오류 ^^;
				bw.write((a+b)+"\n");				
			}
			br.close();
			bw.flush();
			bw.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
