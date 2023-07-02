import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10988_팰린드롬인지확인하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word=in.readLine();
		int length=word.length();
		int result=1; // default값을 true(1)로 해줘야 한다
		
		for(int i=0;i<length/2;i++) {
			char start=word.charAt(i);
			char end=word.charAt(length-1-i);
			
			if(start!=end) { // 하나라도 틀리면 바로 false(0)을 출력한다
				result=0;
			}
		}
		out.write(String.valueOf(result)); // result는 int형, write는 String형이라 형변환을 시켜줘야한다
		out.flush();
		out.close();
	}

}
