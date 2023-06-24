package 풀이_5_3주차;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_1546평균 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// 첫번째줄의 수는 N 과목 갯수
		int N=Integer.parseInt(in.readLine());
		StringTokenizer st=new StringTokenizer(in.readLine());
		// 두번째 줄은 과목의 점수
		double[] score=new double[N];
		for(int i=0;i<N;i++)
		{
			score[i]=Double.parseDouble(st.nextToken());
		}
		
		// 점수 중 가장 높은 점수 찾기
		double max=0;
		for(int i=0;i<N;i++)
		{
			if(score[i]>max)
			{
				max=score[i];
			}
		}
		// 새로운 평균 구하는 법: (원래점수/최고점*100 )
		               //= (score[i]/max*100)
		double avg=0;
		double sum=0;
		for(int i=0;i<N;i++)
		{
			sum+=score[i]/max*100;
		}
		avg=sum/N;
		
		out.write(String.valueOf(avg));
		out.flush();
	}

}
