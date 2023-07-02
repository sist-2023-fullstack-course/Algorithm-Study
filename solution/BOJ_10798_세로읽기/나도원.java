import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10798_세로읽기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] arr=new char[5][15];
		
		for(int i=0;i<arr.length;i++) {
			String word=in.readLine(); // 한 줄씩 읽어오기
			
			for(int j=0;j<word.length();j++) {
				arr[i][j]=word.charAt(j); // 하나의 줄에서 한 글자씩 읽어와서 배열에 저장
			}
		}
		
		for(int i=0;i<15;i++) { 
			for(int j=0;j<5;j++) { 
				if(arr[j][i]==0) { // 값이 없는 경우 그대로 진행
					continue;
				}
				out.write(arr[j][i]);
			}
		}
		out.flush();
		out.close();
		
		
	}

}

