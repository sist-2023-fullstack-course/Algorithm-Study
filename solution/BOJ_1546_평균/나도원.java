import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1546_평균 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력칸 첫번째 줄은 과목 갯수 n만 입력
		// 숫자 n 하나만 입력하므로 StringTokenizer가 아닌
		// readLine으로 첫줄을 먼저 읽어서 값을 가져와서 저장한다.
		int n=Integer.parseInt(in.readLine()); // in.readline이 아닌 st.nextToken을 가져올 경우 NoSuchElementException 발생
		
		// 두번째 줄은 과목점수를 st로 쪼개서 가져온다. 
		StringTokenizer st=new StringTokenizer(in.readLine()); // n과 st의 작성순서를 바꾸면 NumberFormatException 발생
		// score[]배열에 쪼갠 값을 저장한다.
		double[] score=new double[n];
		
		for(int i=0;i<n;i++) {
			score[i]=Double.parseDouble(st.nextToken());
		}
		
		double max=0;
		double sum=0;
		double avg=0;
		
		// 가장 높은 점수 max 찾기
		for(int i=0;i<score.length;i++) {
			if(score[i]>max)
				max=score[i];
		}
		
		// 찾은 max를 이용해서 새로운 점수의 합 구하기
		for(int i=0; i<score.length;i++) {
			sum+=(score[i]/max)*100;
		}
		
		// 새로운 점수 합의 평균 구하기
		avg=sum/n;
		
		out.write(avg+" "); // avg는 double값이나 " " 공백 문자열을 더해줘서 전체를 문자열로 인식한다.
							// write의 리턴형은 String
		out.flush();
		out.close();
		
	}

}
